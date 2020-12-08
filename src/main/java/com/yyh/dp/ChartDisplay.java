package com.yyh.dp;
/*     
 created by yangzhizhong at 2020/11/23   
 */

public class ChartDisplay {
    public void display(String type) {
        if ("pie".equals(type)) {
            PieChart pieChart = new PieChart();
            pieChart.display();
        } else if ("bar".equals(type)) {
            BarChart barChart = new BarChart();
            barChart.display();
        }

    }

    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.display("pie");


    }
}
