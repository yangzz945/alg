package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/9/24   
 */

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.*;

public class TopoSort {

    public static void main(String[] args) {

        Map<Integer,List<Integer>> nestMap = Maps.newHashMap();
        nestMap.put(201,Lists.newArrayList(0));
        nestMap.put(202,Lists.newArrayList(0));
        nestMap.put(203,Lists.newArrayList(202,1));
        nestMap.put(200,Lists.newArrayList(201,202,2));
        List<Integer> result = reloadSpecialProcess(nestMap);
        System.out.println(result);


    }

    private static List<Integer> reloadSpecialProcess(Map<Integer, List<Integer>> nestedProcessorMap) {
        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> specialProcessList = Lists.newArrayList();

        for (Iterator<Map.Entry<Integer, List<Integer>>> it = nestedProcessorMap.entrySet().iterator(); it.hasNext();){
            Map.Entry<Integer, List<Integer>> item = it.next();

            Integer masterProcessorId = item.getKey();
            List<Integer> slaveProcessorIds = item.getValue();

            if (slaveProcessorIds.get(slaveProcessorIds.size() - 1) == 0) {
                queue.add(masterProcessorId);
                specialProcessList.add(masterProcessorId);
                it.remove();
                //nestedProcessorMap.remove(k);
            }
           /* //... todo with item
            it.remove();*/
        }

        /*nestedProcessorMap.forEach((k, v) -> {
            if (v.get(v.size() - 1) == 0) {
                queue.add(k);
                specialProcessList.add(k);
                //nestedProcessorMap.remove(k);
            }

        });*/

        while(!queue.isEmpty()) {
            System.out.println("begin:"+queue);
            Integer processorId = queue.poll();
            /*nestedProcessorMap.forEach((k, v) -> {
                if (v.contains(processorId)) {
                    Integer var = v.get(v.size() - 1);
                    v.remove(v.size() - 1);
                    v.add(var - 1);
                }

                if (v.get(v.size() - 1) == 0&&!specialProcessList.contains(k)) {
                    queue.add(k);
                }

            });*/

            for (Iterator<Map.Entry<Integer, List<Integer>>> it = nestedProcessorMap.entrySet().iterator(); it.hasNext();) {
                Map.Entry<Integer, List<Integer>> item = it.next();

                Integer k = item.getKey();
                List<Integer> v = item.getValue();

                if (v.contains(processorId)) {
                    Integer var = v.get(v.size() - 1);
                    v.remove(v.size() - 1);
                    v.add(var - 1);
                }

                if (v.get(v.size() - 1) == 0&&!specialProcessList.contains(k)) {
                    queue.add(k);
                    it.remove();
                    System.out.println("after add:"+queue);
                }

            }


            if (!specialProcessList.contains(processorId)) {
                specialProcessList.add(processorId);
            }
            System.out.println("specialProcessList:"+specialProcessList);

        }
        return specialProcessList;
    }

    private static List<Integer> reloadSpecialProcess2(Map<Integer, List<Integer>> nestedProcessorMap) {
        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> specialProcessList = Lists.newArrayList();
        nestedProcessorMap.forEach((k, v) -> {
            if (v.get(v.size() - 1) == 0) {
                queue.add(k);
                specialProcessList.add(k);
            }
        });

        while(!queue.isEmpty()) {
            System.out.println("begin:"+queue);
            Integer processorId = queue.poll();
            nestedProcessorMap.forEach((k, v) -> {
                if (v.contains(processorId)) {
                    Integer var = v.get(v.size() - 1);
                    v.remove(v.size() - 1);
                    v.add(var - 1);
                }

                if (v.get(v.size() - 1) == 0 && !specialProcessList.contains(k)) {
                    queue.add(k);
                    System.out.println("after add:"+queue);
                }
            });
            System.out.println("end:"+queue);
            if (!specialProcessList.contains(processorId)) {
                specialProcessList.add(processorId);
            }
            System.out.println("specialProcessList:"+specialProcessList);
            /*nestedProcessorMap.forEach((k, v) -> {
                if (v.get(v.size() - 1) == 0 && !specialProcessList.contains(k)) {
                    queue.add(k);
                    System.out.println("after add:"+queue);
                }
            });*/

        }
        return specialProcessList;
    }

}
