package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/10/16   
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTest {
    public  static  <K, V> Map<K, V> parseToMap(String json, Class<K> keyType, Class<V> valueType) {
        return  JSON.parseObject(json, new TypeReference<HashMap<K, V>>(keyType, valueType) {});
    }

    public static void main(String[] args) {
       // String json = "{\"key\":\"1\"}";
        //System.out.println(parseToMap(json,String.class,Integer.class));

        String json =
                "{\"sdate\":\"2018-03-31\",\"edate\":\"2018-04-04\",\"music\":1,\"aMdd\":\"10521\",\"mtime\":\"2018-10-09 22:55:43\",\"attr_item_type\":1,\"attr_item_business_id\":\"8833974\",\"ctime\":\"2018-04-03 09:32:28\"}";

        List<Map<String,String>>  result = getItemsFromRedis(json,String.class,String.class);
        System.out.println(result);
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
