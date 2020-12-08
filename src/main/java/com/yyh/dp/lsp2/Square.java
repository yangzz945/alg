package com.yyh.dp.lsp2;
/*     
 created by yangzhizhong at 2020/11/24   
 */

public class Square extends Shape {

    public void setWidthAndHeight(int width,int height) {
        this.width = width;
        this.height = height;
        if (this.width!=this.height) {
            this.width = this.height;
        }
    }
}
