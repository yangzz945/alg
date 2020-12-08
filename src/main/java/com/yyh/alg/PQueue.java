package com.yyh.alg;
/*     
 created by yangzhizhong at 2020/11/24   
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue {

    private int MAX_ELE = 100;

    public PQueue(int max) {
        this.MAX_ELE = max;
    }

    private Comparator<Integer> comparator = new Comparator<Integer>(){ //大顶堆，容量11
        @Override
        public int compare(Integer i1,Integer i2){
            return i2-i1;
        }
    };

    private  PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(11,comparator);

    public void add(int i) {
        if (priorityQueue.size()<this.MAX_ELE) {
            this.priorityQueue.add(i);
        } else {
            int e = this.priorityQueue.peek();
            if (i<e) {
                this.priorityQueue.poll();
                this.priorityQueue.add(i);
            }

        }

    }

    public PriorityQueue getPQueue() {
        return this.priorityQueue;
    }

    public static void main(String[] args) {


       /* priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(10);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());*/
        PQueue pQueue = new PQueue(3);
        pQueue.add(1);
        pQueue.add(10);
        pQueue.add(5);
        pQueue.add(6);
        pQueue.add(20);
        pQueue.add(3);
        System.out.println(pQueue.getPQueue());

    }
}
