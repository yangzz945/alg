package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/11/8   
 */

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.util.HashSet;
import java.util.concurrent.*;

public class TestSynchronousQueue {

    public static void  main(String[] args) {

        ThreadPoolExecutor processorService = new ThreadPoolExecutor(
                2,
                3,
                20,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>(),
                new ThreadFactoryBuilder().setNameFormat("processor-pool-%d").build(),
                new ThreadPoolExecutor.AbortPolicy());

        FutureTask task0= new FutureTask<>(new Task(0));
        FutureTask task1= new FutureTask<>(new Task(1));
        FutureTask task2= new FutureTask<>(new Task(2));
        FutureTask task3= new FutureTask<>(new Task(3));
        processorService.execute(task0);
        processorService.execute(task1);
        System.out.println(processorService.toString());
        processorService.execute(task2);
        //processorService.submit(task3);
        System.out.println(processorService.toString());
        processorService.execute(task3);




    }

    /*public static String threadStats(ThreadPoolExecutor processorService) {
        //processorService.get
        //HashSet<ThreadPoolExecutor.Worker> workers = PropertyUtils.getProperty(processorService,"workers");
    }*/



    public static class Task implements Callable {
        private int index ;
        public Task(int idx) {
            this.index = idx;
        }
        @Override
        public Integer call() {
            try {
                Thread.sleep(50000);
                return index;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return index;
        }
    }
}
