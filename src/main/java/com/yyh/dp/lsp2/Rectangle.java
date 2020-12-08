package com.yyh.dp.lsp2;
/*     
 created by yangzhizhong at 2020/11/24   
 */

public class Rectangle extends Shape {


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setHeight(2);
        System.out.println("width*height="+rectangle.getWidth()*rectangle.getHeight());


    }


}
