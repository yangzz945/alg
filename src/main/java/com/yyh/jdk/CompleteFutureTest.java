package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/7/10   
 */


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class CompleteFutureTest {

    public static void main(String[] args) throws Exception {

        List<Integer> iList = Lists.newArrayList();
        long start = System.currentTimeMillis();
        Fg fg = new Fg();
        //List<CompletableFuture> cfList = Lists.newArrayList();
        for (int i=0;i<10000;i++) {
            //CompletableFuture cF = CompletableFuture.supplyAsync(() -> {
            //    return fg.fg(1);
            //});//
            //cF.thenAccept(System.out::println);
            //cfList.add(cF);
            //fg.fg(i);
            fg.fg(1);
            iList.add(i);
        }

        /*for(int i =0 ;i<1000;i++) {
            cfList.get(i).get();
        }*/
        //CompletableFuture<Void> all = CompletableFuture.allOf(cfList.toArray(new CompletableFuture[cfList.size()]));
        //all.join();
        //Thread.sleep(100);
       System.out.println("cost:"+(System.currentTimeMillis()-start));


        ExecutorService executorService = Executors.newFixedThreadPool(10);


        CompletionService ecs = new ExecutorCompletionService(executorService);
        start = System.currentTimeMillis();
        List<Future<Map>> futures
                = new ArrayList<Future<Map>>();

        try {

            futures.add(ecs.submit(()->{
                for (int i=0;i<500;i++) {
                    fg.fg(1);
                }
                Map<String,String> map = Maps.newHashMap();
                map.put("1","1");

                return map;
            }));

            futures.add(ecs.submit(()->{
                for (int i=0;i<500;i++) {
                    fg.fg(1);
                }
                Map<String,String> map = Maps.newHashMap();
                map.put("2","2");

                return map;
            }));

            for (int i = 0; i < 2; ++i) { try {
                Object r = ecs.take().get();
                System.out.println(r);
            } catch (ExecutionException ignore) {}
            }
        }
        finally {
            for (Future f : futures)
                f.cancel(true);
        }
        System.out.println("cost:"+(System.currentTimeMillis()-start));


        start = System.currentTimeMillis();


        CompletableFuture cF1 = CompletableFuture.supplyAsync(() -> {
            for (int i=0;i<250;i++) {
                fg.fg(1);
            }
            return "";
        },executorService);

        CompletableFuture cF2 = CompletableFuture.supplyAsync(() -> {
            for (int i=0;i<250;i++) {
                fg.fg(1);
            }
            return "";
        },executorService);

        CompletableFuture cF3 = CompletableFuture.supplyAsync(() -> {
            for (int i=0;i<250;i++) {
                fg.fg(1);
            }
            return "";
        },executorService);

        CompletableFuture cF4 = CompletableFuture.supplyAsync(() -> {
            for (int i=0;i<250;i++) {
                fg.fg(1);
            }
            return "";
        },executorService);

        List<CompletableFuture> cfList = Lists.newArrayList();
        cfList.add(cF1);
        cfList.add(cF2);
        cfList.add(cF3);
        cfList.add(cF4);
        CompletableFuture.allOf(cfList.toArray(new CompletableFuture[cfList.size()])).join();
        System.out.println("cost:"+(System.currentTimeMillis()-start));


        start = System.currentTimeMillis();

        iList.parallelStream().forEach(ele->{
            //System.out.println(Thread.currentThread().getName());
            fg.fg(1);
        });

        System.out.println("cost:"+(System.currentTimeMillis()-start));



    }

    static class Fg {
        public Map<String,Float> fg(int a)   {
            Map<String,Float> map = Maps.newHashMap();
            try {
                //Thread.sleep(10);
                map.put(String.valueOf(a), (float) a);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return map;
        }
    }
}
