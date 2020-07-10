package com.yyh.alg;
/*     
 created by yangzhizhong at 2019/9/29   
 */

import org.tensorflow.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;

public class HelloTensorFlow {
    public static void main1(String[] args) throws Exception {
        try (Graph g = new Graph()) {
            final String value = "Hello from " + TensorFlow.version();

            // Construct the computation graph with a single operation, a constant
            // named "MyConst" with a value "value".
            try (Tensor t = Tensor.create(value.getBytes("UTF-8"))) {
                // The Java API doesn't yet include convenience functions for adding operations.
                g.opBuilder("Const", "MyConst").setAttr("dtype", t.dataType()).setAttr("value", t).build();
            }

            // Execute the "MyConst" operation in a Session.
            try (Session s = new Session(g);
                 // Generally, there may be multiple output tensors,
                 // all of them must be closed to prevent resource leaks.
                 Tensor output = s.runner().fetch("MyConst").run().get(0)) {
                System.out.println(new String(output.bytesValue(), "UTF-8"));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        try  {
            Graph g = new Graph();
            //SavedModelBundle smb = SavedModelBundle.loader("/Users/yangzhizhong/dev/alg/data/smb").load();
            //Graph g = smb.graph();
            final String value = "Hello from " + TensorFlow.version();

            g.importGraphDef(Files.readAllBytes(Paths.get(
                    "/Users/yangzhizhong/dev/alg/data/saved_model_qinbing.pb"
            )));

            // Construct the computation graph with a single operation, a constant
            // named "MyConst" with a value "value".
            /*try (Tensor t = Tensor.create(value.getBytes("UTF-8"))) {
                // The Java API doesn't yet include convenience functions for adding operations.
                g.opBuilder("Const", "MyConst").setAttr("dtype", t.dataType()).setAttr("value", t).build();
            }*/

            // Execute the "MyConst" operation in a Session.
            Session sess = new Session(g);
                 // Generally, there may be multiple output tensors,
                 // all of them must be closed to prevent resource leaks.
                 //Tensor output = s.runner().fetch("MyConst").run().get(0)) {
                //System.out.println(new String(output.bytesValue(), "UTF-8"));
                 //float[][] input = {{56, 632, 675, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
            int M = 16;
            int N= 209;
            float[][] input = new float[M][N];
            for(int i=0;i<M;i++) {
                for(int j=0;j<N;j++) {
                    input[i][j]=0.0f;
                }
            }

            Iterator<Operation> opIter = g.operations();//operations()
            while (opIter.hasNext()) {
                Operation oper = opIter.next();
                System.out.println(oper.name());
            }




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
