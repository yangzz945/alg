package com.yyh.jdk;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述:
 * TestReentrantLock
 * com.yyh.jdk.TestReentrantLock
 *
 * @author yangzhizhong
 * @date 2018/8/16
 * <p>
 * config_start:
 * |com.yyh.jdk.TestReentrantLock|TestReentrantLock|yangzhizhong|
 * config_end:
 */
public class TestReentrantLock {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Runnable> runnes = new ArrayList<>();//Lists.newArrayList();
        for (int i = 1;i <= 3;i++) {
            Runner runner = new Runner(lock, i);
            runnes.add(runner);
            executorService.submit(runner);

        }
    }

    public static class MyNode {
        public Object getAqsObj() {
            return aqsObj;
        }

        public void setAqsObj(Object aqsObj) {
            this.aqsObj = aqsObj;
        }

        private Object aqsObj;
        volatile int waitStatus;


        volatile Object prev;


        volatile Object next=null;


        volatile Thread thread;

        MyNode nextWaiter;




        MyNode() {    // Used to establish initial head or SHARED marker
        }

        MyNode(Thread thread, MyNode mode) {     // Used by addWaiter
            this.nextWaiter = mode;
            this.thread = thread;
        }

        MyNode(Thread thread, int waitStatus) { // Used by Condition
            this.waitStatus = waitStatus;
            this.thread = thread;
        }

        public int getWaitStatus() {
            return waitStatus;
        }

        public void setWaitStatus(int waitStatus) {
            this.waitStatus = waitStatus;
        }

        public Object getPrev() {
            return prev;
        }

        public void setPrev(Object prev) {
            this.prev = prev;
        }

        public Object getNext() {
            return next;
        }

        public void setNext(Object next) {
            this.next = next;
        }

        public Thread getThread() {
            return thread;
        }

        public void setThread(Thread thread) {
            this.thread = thread;
        }

        public MyNode getNextWaiter() {
            return nextWaiter;
        }

        public void setNextWaiter(MyNode nextWaiter) {
            this.nextWaiter = nextWaiter;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.aqsObj.toString()).append(" convertTo ");
            sb.append("MyNode@").append(Integer.toHexString(hashCode()))
            .append("{");
            sb.append("waitStatus=").append(waitStatus);
            sb.append(", prev=").append(prev);
            sb.append(", next=").append(next);
            sb.append(", thread=").append(thread);

            sb.append(", threadStatus=").append(thread==null?"":thread.getState());
            sb.append(", nextWaiter=").append(nextWaiter);
            sb.append('}');
            return sb.toString();
        }
    }

    public static MyNode castNode(Object nodeObj) {
        MyNode myNode = new MyNode();
        try {
            myNode.setAqsObj(nodeObj);
            Class cls = Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node");
            Field objNext = FieldUtils.getDeclaredField(cls,"next",true);//FieldUtils.readDeclaredField(aqs,"head",true);
            Object nextNodeObj = objNext.get(nodeObj);
            myNode.setNext(nextNodeObj);

            Field objPrev = FieldUtils.getDeclaredField(cls,"prev",true);//FieldUtils.readDeclaredField(aqs,"head",true);
            Object prevNodeObj = objPrev.get(nodeObj);
            myNode.setPrev(prevNodeObj);

            Field waitStatusField = FieldUtils.getDeclaredField(cls,"waitStatus",true);
            //System.out.println("next:"+objNext.get(nodeObj));
            myNode.setWaitStatus(waitStatusField.getInt(nodeObj));



            Field threadField = FieldUtils.getDeclaredField(cls,"thread",true);
            //System.out.println("next:"+objNext.get(nodeObj));
            myNode.setThread((Thread)threadField.get(nodeObj));


        } catch(Exception ex) {

        }


        return myNode;
    }

    public static class Runner implements Runnable {
        private ReentrantLock lock ;
        private int idx;
        public Runner(ReentrantLock lock,int idx) {
            this.lock = lock;
            this.idx = idx;
        }
        @Override
        public void run() {
            this.lock.lock();


            try {
                AbstractQueuedSynchronizer aqs = (AbstractQueuedSynchronizer) FieldUtils.readDeclaredField(this.lock,"sync",true);//.getProperty();

                System.out.println("currentThread:"+Thread.currentThread());
                System.out.println("getQueueLength:"+this.lock.getQueueLength());
                System.out.println("getQueuedThreads:"+aqs.getQueuedThreads());

                //aqs.getExclusiveQueuedThreads();

               // Class cls = Class.forName("java.util.concurrent.locks.AbstractQueuedSynchronizer$Node");

                Field headField = FieldUtils.getDeclaredField(AbstractQueuedSynchronizer.class,"head",true);
                Field stateField = FieldUtils.getDeclaredField(AbstractQueuedSynchronizer.class,"state",true);//FieldUtils.readDeclaredField(aqs,"head",true);
                Object head = headField.get(aqs);
                int state = stateField.getInt(aqs);
                //System.out.println("head:"+head);

               /* Field objNext = FieldUtils.getDeclaredField(cls,"next",true);//FieldUtils.readDeclaredField(aqs,"head",true);
                if (objNext!=null) {
                    System.out.println("next:" + objNext.get(head));
                }*/


                int i = 0;
                while(null!=head) {
                    MyNode myNode = castNode(head);
                    if (i==0) {
                        System.out.print("state:"+state+",head:");
                    } else {
                        System.out.print("state:"+state+",next:");
                    }
                    System.out.println(myNode);
                    //if (null!=myNode.getNext()) {
                        head = myNode.getNext();
                    //}
                    i++;
                }

                //Field tailObj = FieldUtils.getDeclaredField(AbstractQueuedSynchronizer.class,"tail",true);
                //java.util.concurrent.locks.AbstractQueuedSynchronizer$Node
                //System.out.println("tail:"+tailObj.get(aqs));

                System.out.println(idx);
                //this.lock.lock();
                try {
                   // System.out.println(idx+100);
                } finally {
                  //  this.lock.unlock();
                }


            }  catch(Exception ex) {
                ex.printStackTrace();
            }

            finally {
                this.lock.unlock();
            }
        }
    }
}
