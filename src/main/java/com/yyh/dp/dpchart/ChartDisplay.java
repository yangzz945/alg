package com.yyh.dp.dpchart;
/*     
 created by yangzhizhong at 2020/11/23   
 */

public class ChartDisplay {
    private AbstractChart abstractChart;

    public void setChart(AbstractChart abstractChart) {
        this.abstractChart = abstractChart;
    }

    public void display() {
        this.abstractChart.display();
    }

    public static void main(String[] args) {

        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.setChart(new PieChart());

        chartDisplay.display();
    }

}
