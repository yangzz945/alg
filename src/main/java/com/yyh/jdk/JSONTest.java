package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/10/16   
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTest {
    public  static  <K, V> Map<K, V> parseToMap(String json, Class<K> keyType, Class<V> valueType) {
        return  JSON.parseObject(json, new TypeReference<HashMap<K, V>>(keyType, valueType) {});
    }

    public static Map getValue(String param) {

        Map map = new HashMap();
        String str = "";
        String key = "";
        Object value = "";
        char[] charList = param.toCharArray();
        boolean valueBegin = false;
        for (int i = 0; i < charList.length; i++) {
            char c = charList[i];
            if (c == '{') {
                if (valueBegin == true) {
                    value = getValue(param.substring(i, param.length()));
                    i = param.indexOf('}', i) + 1;
                    map.put(key, value);
                }
            } else if (c == '=') {
                valueBegin = true;
                key = str;
                str = "";
            } else if (c == ',') {
                valueBegin = false;
                value = str;
                str = "";
                map.put(key, value);
            } else if (c == '}') {
                if (str != "") {
                    value = str;
                }
                map.put(key, value);
                return map;
            } else if (c != ' ') {
                str += c;
            }
        }
        return map;
    }


    public static void main(String[] args) {
       String json = "{\"key\":\"1\"}";
       // System.out.println(parseToMap(json,String.class,Integer.class));

       // String json =
        //        "{\"sdate\":\"2018-03-31\",\"edate\":\"2018-04-04\",\"music\":1,\"aMdd\":\"10521\",\"mtime\":\"2018-10-09 22:55:43\",\"attr_item_type1\":1,\"attr_item_business_id\":\"8833974\",\"ctime\":\"2018-04-03 09:32:28\"}";

        List<Map<String,Float>>  result = getItemsFromRedis(json,String.class,Float.class);
        System.out.println(result);

        Map<String,Map<String,String>> map = Maps.newHashMap();
        map.put("0",Maps.newHashMap());
        map.get("0").put("onTravel_article_7_ctr","0.1");
        map.get("0").put("onTravel_article_30_ctr","0.2");

        map.put("1",Maps.newHashMap());
        map.get("1").put("onTravel_article_7_ctr","0.3");
        map.get("1").put("onTravel_article_30_ctr","0.4");
        System.out.println(map);

        Map result1 = (Map)getValue(map.toString());
        System.out.println(result1);
       /*Map<String,String> map = Maps.newHashMap();

        map.put("reqId","123");
        map.put("algInfo","fdsagaf");
        String jsonStr = JSONObject.toJSONString(map);
        System.out.println(jsonStr);
        DateTimeFormatter ISO_OFFSET_DATE_TIME;

        ISO_OFFSET_DATE_TIME = new DateTimeFormatterBuilder()
                    .parseCaseInsensitive()
                    .append(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                    .appendLiteral('T').append(DateTimeFormatter.ofPattern("HH:mm:ss"))
                    .appendOffsetId().toFormatter();*/
                    //.toFormatter(ResolverStyle.STRICT, IsoChronology.INSTANCE);


        //System.out.println(ZonedDateTime.now().format(ISO_OFFSET_DATE_TIME));
    }

    public static <K,V> List<Map<K,V>> getItemsFromRedis(String jsonStr, Class<K> keyType, Class<V> valueType) {
        //List<String> jsons = RedisUtil.mget(keys);
        List<String> jsons = Lists.newArrayList(jsonStr);
        List<Map<K,V>> rst = new ArrayList<>();
        for (String json : jsons) {
            Map<K,V> map = Maps.newHashMap();
            if(StringUtils.isNotEmpty(json)){
                Map<K,V> jsonMap = JSON.parseObject(json, new  TypeReference<HashMap<K, V>>(keyType, valueType) {});
                if(null != jsonMap ){
                    map = jsonMap;
                }
            }
            map.putIfAbsent((K)"attr_item_type",(V)"0");
            rst.add(map);
        }
       /* jsons.stream().forEach(json-> {
            Map<K,V> map = Maps.newHashMap();
            if(StringUtils.isNotEmpty(json)){
                Map<K,V> jsonMap = JSON.parseObject(json, new  TypeReference<HashMap<K, V>>(keyType, valueType) {});
                if(null != jsonMap ){
                    map = jsonMap;
                }
            }
            rst.add(map);
        });*/

        return rst;
    }


}
