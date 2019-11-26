package com.yyh.matrix;
/*     
 created by yangzhizhong at 2018/10/21   
 */


import org.la4j.Matrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.sparse.CRSMatrix;

public class SparseMatrixTest {
    public static void main(String[] args) {
        double[] d = new double[]{
            1,7,0,0,
            0,2,8,0,
            5,0,3,9,
            0,6,0,4

        };
        Matrix basic = Basic2DMatrix.from1DArray(4,4,d);
        System.out.println(basic);
        SparseMatrix a = basic.toRowMajorSparseMatrix();//CRSMatrix.zero(10, 5);
        //System.out.println(a.determinant());
        //System.out.println(a.density());
        System.out.println(a.rows());
        System.out.println(a.columns());
        //a.

        System.out.println(a.toMatrixMarket());

        System.out.println(a);

    }
}
