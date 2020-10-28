package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/10/14   
 */

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueue<E> {
    private LinkedList<E> list ;
    private int cap;
    private int count;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public BlockingQueue(int cap) {
        this.cap = cap;
        this.list = new LinkedList<E>();
    }

    public void put(E e) {
        lock.lock();
        try {
            while(count==cap) {
                try {
                    notFull.await();
                } catch (Exception ex) {

                }
            }


            this.list.add(e);
            count++;
            notEmpty.signal();

        } finally {
            lock.unlock();
        }
    }

    public E take() {
        lock.lock();
        E e = null;
        try {
            while(count==0) {
                try {
                    notEmpty.await();
                } catch (Exception ex) {

                }
            }



            e = this.list.pop();
            count--;
            lock.unlock();



        } finally {
            notFull.signal();
        }
        return e;
    }

}
