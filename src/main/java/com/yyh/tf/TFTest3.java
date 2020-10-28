/*
package com.yyh.tf;
*/
/*
 created by yangzhizhong at 2020/7/23   
 *//*


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.tensorflow.*;
import org.tensorflow.ndarray.FloatNdArray;
import org.tensorflow.ndarray.StdArrays;
import org.tensorflow.types.TFloat32;

import java.util.Iterator;
import java.util.List;

public class TFTest3 {

    public static void main(String[] args) {
        SavedModelBundle savedModelBundle = SavedModelBundle.loader("/Users/yangzhizhong/dev/alg/data/rec_content_weight_14").withTags("serve").load();




        //FloatBuffer x = inputs.createBuffer();
        float[][] fVec = new float[1][282];
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < fVec.length; i++) {
                fVec[j][i] = 0;
            }
        }

        List<Tensor<?>> out = Lists.newArrayList();
        FloatNdArray floatNdArray = StdArrays.ndCopyOf(fVec);
        Tensor<TFloat32> inputs = TFloat32.tensorOf(floatNdArray);//TFloat32.vectorOf(fVec);//Tensor.of(DataType.create());//Tensor.create(fVec);

        long start = System.currentTimeMillis();
        for (int i=0;i<100;i++) {
            Session.Runner runner = savedModelBundle.session().runner();
            runner.feed("serving_default_input", inputs);

            runner.fetch("StatefulPartitionedCall_2");

            out = runner.run();

            Tensor<?> tensor = out.get(0);


            float[][] result = new float[1][1];

            StdArrays.copyTo(result,(FloatNdArray) tensor.data());
            //TFloat32 data = (TFloat32)tensor.data();
            //data.copyTo(result);
            //System.out.println(result[0][0]);
        }




        System.out.println("cost1="+(System.currentTimeMillis()-start));

        */
/*Graph graph = savedModelBundle.graph();
        Iterator<Operation> iterator =  graph.operations();
        while (iterator.hasNext()) {
            Operation op = iterator.next();
            System.out.println(op);
        }*//*



        */
/*start = System.currentTimeMillis();
        Session session1 = new Session(savedModelBundle.graph());
        //session1.
        //session1.runner().run
        //session1.runner().addTarget()
        for (int i=0;i<100;i++) {
            Session.Runner runner = session1.runner();
            runner.feed("serving_default_input", inputs);

            runner.fetch("StatefulPartitionedCall_2");

            out = runner.run();

            Tensor<?> tensor = out.get(0);


            float[][] result = new float[1][1];
            tensor.copyTo(result);
            System.out.println(result[0][0]);
        }
        System.out.println("cost2="+(System.currentTimeMillis()-start));*//*

        */
/*//*
/for (String feedOpName : feed.keySet()) {
            float[][] floats = feed.get(feedOpName);
            Tensor<?> inputTensor = Tensor.create(floats);
            tensorList.add(inputTensor);
            runner.feed(feedOpName, inputTensor);
            size = floats.length;
            feedSize += floats.length * floats[0].length;
        }
        for (String fetchOpName : fetch) {
            runner.fetch(fetchOpName);
        }

        sw.start();
        out = runner.run();*//*


    }
}
*/
