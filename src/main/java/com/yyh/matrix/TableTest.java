package com.yyh.matrix;
/*     
 created by yangzhizhong at 2018/10/21   
 */

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

public class TableTest {
    public static void main(String[] args) {

        Table<String, Integer, String> aTable = HashBasedTable.create();

        for (char a = 'A'; a <= 'C'; ++a) {
            for (Integer b = 1; b <= 3; ++b) {
                aTable.put(Character.toString(a), b, String.format("%c%d", a, b));
            }
        }
        System.out.println(aTable);

        ImmutableTable<String, String, Float> table = ImmutableTable.<String, String, Float>builder()
                .put("1_1","f1",Float.valueOf(1.0f))
                .put("1_1","f2",Float.valueOf(2.0f))
                .put("2_1","f2",new Float(3.0f))
                .put("2_1","f1",new Float(4.0f))

                .build();

        System.out.println(table);
        System.out.println(table.rowKeySet());
        System.out.println(table.columnKeySet());
        System.out.println(table.row("1_1"));
        System.out.println(table.values());

        /*System.out.println(aTable.column(2));
        System.out.println(aTable.row("B"));
        System.out.println(aTable.get("B", 2));

        System.out.println(aTable.contains("D", 1));
        System.out.println(aTable.containsColumn(3));
        System.out.println(aTable.containsRow("C"));
        System.out.println(aTable.columnMap());
        System.out.println(aTable.rowMap());

        System.out.println(aTable.remove("B", 3));*/
    }
}
