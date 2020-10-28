package com.yyh.kryo;
/*     
 created by yangzhizhong at 2018/10/15   
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.BeanSerializer;
import com.esotericsoftware.kryo.serializers.DefaultSerializers;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.google.common.base.Charsets;
import com.yyh.pojo.FeaturePojo;
import com.yyh.pojo.Foo;
import org.apache.commons.math3.linear.ArrayRealVector;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.*;

public class KryoSerializer implements Serializer {
    // 由于kryo不是线程安全的，所以每个线程都使用独立的kryo
    final ThreadLocal<Kryo> kryoLocal = new ThreadLocal<Kryo>() {
        @Override
        protected Kryo initialValue() {
            Kryo kryo = new Kryo();
            //kryo.register(ct, new BeanSerializer<>(kryo, ct));
            kryo.register(Foo.class);
            kryo.register(FeaturePojo.class);
            kryo.register( Arrays.asList( "" ).getClass(), new DefaultSerializers.ArraysAsListSerializer() );
            kryo.register( Collections.EMPTY_LIST.getClass(), new DefaultSerializers.CollectionsEmptyListSerializer() );
            kryo.register( Collections.EMPTY_MAP.getClass(), new DefaultSerializers.CollectionsEmptyMapSerializer() );
            kryo.register( Collections.EMPTY_SET.getClass(), new DefaultSerializers.CollectionsEmptySetSerializer() );
            kryo.register( Collections.singletonList( "" ).getClass(), new DefaultSerializers.CollectionsSingletonListSerializer() );
            kryo.register( Collections.singleton( "" ).getClass(), new DefaultSerializers.CollectionsSingletonSetSerializer() );
            kryo.register( Collections.singletonMap( "", "" ).getClass(), new DefaultSerializers.CollectionsSingletonMapSerializer() );
            //kryo.register( GregorianCalendar.class, new GregorianCalendarSerializer() );
            //kryo.register( InvocationHandler.class, new JdkProxySerializer() );

            // 序列化List.subList() 方法生成的对象
            //kryo.register(new ArrayList<>().subList(0, 0).getClass(), new SubListSerializers.ArrayListSubListSerializer());

            kryo.register(HashMap.class,new MapSerializer());
            kryo.register(BigDecimal.class, new DefaultSerializers.BigDecimalSerializer());
            //kryo.register(ArrayRealVector.class,new CompatibleFieldSerializerReflectionFactorySupport(kryo,ArrayRealVector.class));

            //支持对象循环引用（否则会栈溢出）

            kryo.setRegistrationRequired(false);//关闭注册
            kryo.setReferences(true); //默认值就是 true，添加此行的目的是为了提醒维护者，不要改变这个配置
            return kryo;
        }
    };
    final ThreadLocal<Output> outputLocal = new ThreadLocal<Output>();
    final ThreadLocal<Input> inputLocal = new ThreadLocal<Input>();
    private Class<?> ct = null;

    public KryoSerializer(Class<?> ct) {
        this.ct = ct;
    }

    public Class<?> getCt() {
        return ct;
    }

    public void setCt(Class<?> ct) {
        this.ct = ct;
    }

    @Override
    public void serialize(Object obj, byte[] bytes) {
        Kryo kryo = getKryo();
        Output output = getOutput(bytes);
        kryo.writeObjectOrNull(output, obj, obj.getClass());
        output.flush();
    }

    @Override
    public void serialize(Object obj, byte[] bytes, int offset, int count) {
        Kryo kryo = getKryo();
        Output output = getOutput(bytes, offset, count);
        kryo.writeObjectOrNull(output, obj, obj.getClass());
        output.flush();
    }

    /**
     * 获取kryo
     *
     * @param t
     * @return
     */
    private Kryo getKryo() {
        return kryoLocal.get();
    }

    /**
     * 获取Output并设置初始数组
     *
     * @param bytes
     * @return
     */
    private Output getOutput(byte[] bytes) {
        Output output = null;
        if ((output = outputLocal.get()) == null) {
            output = new Output();
            outputLocal.set(output);
        }
        if (bytes != null) {
            output.setBuffer(bytes);
        }
        return output;
    }

    /**
     * 获取Output
     *
     * @param bytes
     * @return
     */
    private Output getOutput(byte[] bytes, int offset, int count) {
        Output output = null;
        if ((output = outputLocal.get()) == null) {
            output = new Output();
            outputLocal.set(output);
        }
        if (bytes != null) {
            output.writeBytes(bytes, offset, count);
        }
        return output;
    }

    /**
     * 获取Input
     *
     * @param bytes
     * @param offset
     * @param count
     * @return
     */
    private Input getInput(byte[] bytes, int offset, int count) {
        Input input = null;
        if ((input = inputLocal.get()) == null) {
            input = new Input();
            inputLocal.set(input);
        }
        if (bytes != null) {
            input.setBuffer(bytes, offset, count);
        }
        return input;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T deserialize(byte[] bytes, int offset, int count) {
        Kryo kryo = getKryo();
        Input input = getInput(bytes, offset, count);
        return (T) kryo.readObjectOrNull(input, ct);
    }

    @Override
    public <T> T deserialize(byte[] bytes) {
        return deserialize(bytes, 0, bytes.length);
    }

    public static void main(String [] args) {
        //Serializer ser = new KryoSerializer(Msg.class);

        String str = "{\"i82\":0.0,\"i934\":\"0.746708\",\"i898\":36,\"i11\":\"\",\"i910\":427,\"i558\":\"2\",\"i159\":\"140.205505\",\"i5\":27,\"i111\":0.0,\"i921\":21,\"i122\":0.0,\"i36\":0.0,\"i47\":0.0,\"i902\":31,\"i79\":0.0,\"i570\":0,\"i814\":261200,\"i107\":0.0,\"i927\":[0.019536,0.11867,0.027658,0.023083,-0.051741,-0.012724,0.050841,-0.105389,-0.072863,-0.004631,0.04879,0.040811,-0.136637,0.124551,-0.009605,-0.072386,0.045108,0.009605,0.033065,-0.043058,0.007504,0.148499,0.047858,0.111019,-0.060705,0.034674,-0.069162,0.033956,-0.008127,-0.076313,-0.071079,-0.030903],\"i9\":\"2019-07-08 17:12:59\",\"i916\":2,\"i75\":0.0,\"i72\":0.0,\"i853\":5,\"i150\":\"0.964847\",\"i104\":0.0,\"i905\":54362,\"i42\":0.0,\"i933\":[-0.062902,0.087864,0.070845,0.107172,0.033826,0.059978,0.106394,0.08314,-0.016196,-0.021116,-0.110074,0.065028,0.125191,0.080106,0.128927,-0.195993,0.158141,0.184464,0.233227,0.042658,0.299423,0.065212,0.068158,-0.216326,0.127544,-0.186869,0.110623,-0.180076,-0.155247,0.152378,-0.035219,0.085011],\"i875\":1,\"i15\":\"1247\",\"i869\":160,\"i109\":0.0,\"i922\":404,\"i863\":9,\"i892\":1624,\"i881\":221,\"i37\":0.0,\"i909\":2963,\"i155\":[-1.77E-4,-2.45E-4,-4.22E-4,-7.6E-5,-1.63E-4,-1.11E-4,4.01E-4,9.32E-4,-5.46E-4,1.23E-4,0.001051,1.91E-4,-2.8E-4,-5.9E-5,1.42E-4,1.19E-4,2.72E-4,-2.91E-4,2.23E-4,2.41E-4,8.2E-5,-3.13E-4,4.83E-4,-1.04E-4,5.8E-5,-1.53E-4,2.0E-4,-2.11E-4,-1.85E-4,-6.26E-4,4.45E-4,-3.3E-5],\"i812\":91,\"i78\":0.0,\"i904\":54362,\"i12\":\"\",\"i45\":0.0,\"i48\":0.0,\"i4\":1,\"i874\":12,\"i110\":0.0,\"i144\":[34.685087,135.805],\"i147\":\"1.069056\",\"i158\":[34.681382,135.848386],\"i915\":2,\"i121\":0.0,\"i136\":0.0,\"i472\":\"92\",\"i8\":\"2018-07-17 16:04:17\",\"i895\":1044,\"i878\":467,\"i133\":0.0,\"i848\":22,\"i108\":0.0,\"i901\":57932,\"i80\":0.0,\"i471\":\"942110\",\"i919\":164,\"i859\":2,\"i889\":6,\"i891\":1389,\"i33\":0.0,\"i41\":0.0,\"i16\":[],\"i815\":21098,\"i856\":6,\"i76\":0.0,\"i44\":0.0,\"i13\":\"16283\",\"i851\":16,\"i38\":0.0,\"i556\":\"370,398,11874\",\"i77\":0.0,\"i141\":[3.62373,-1.934242,7.616439,-1.040486,1.745051,-17.060305,17.005932,-10.975265,11.421344,1.009273,9.025544,8.602712,-5.318412,-4.385931,14.140952,-11.419232,5.108172,7.162171,2.38185,-25.742405,-8.479621,-9.563464,7.493209,-12.879347,-10.554091,-3.47779,-8.763951,4.582019,8.249632,5.804646,-3.522081,-16.16194,42.628536,7.061901,17.387461,-1.527713,14.189733,-9.285096,-14.664296,5.040432,5.023891,-10.453318,-15.295726,-1.169287,1.887566,-4.562142,2.492904,17.220631,-9.83653,0.366622],\"i873\":748,\"i871\":6,\"i146\":[-0.228268,0.390715,-0.231198,0.109208,0.118562,0.215092,-0.223093,-0.004989,-0.323259,0.051081,0.1228,0.318689,-0.112703,-0.140395,-0.253219,0.03536,-0.292892,0.018125,0.035699,-8.22E-4,0.146198,-0.138464,0.032014,-0.077818,-0.016253,0.187144,-0.134919,0.232067,0.294877,-0.058051,-0.328454,0.02291],\"i849\":2919,\"i135\":0.0,\"i872\":2,\"i40\":0.0,\"i931\":\"0.844343\",\"i888\":39,\"i877\":194,\"i73\":0.0,\"i81\":0.0,\"i896\":498,\"i123\":0.0,\"i105\":0.0,\"i918\":49,\"i557\":\"2\",\"i855\":5,\"i112\":0.0,\"i34\":0.0,\"i2\":3,\"i883\":5,\"i10\":1,\"i944\":1.031016882E9,\"i142\":\"81.645065\",\"i156\":\"0.002065\",\"i134\":0.0,\"i850\":1,\"i810\":\"false\",\"i920\":240,\"i861\":1714,\"i890\":1389,\"i39\":0.0,\"i854\":5,\"i124\":0.0,\"i74\":0.0,\"i887\":3586,\"i46\":0.0,\"i876\":194,\"i865\":1,\"i149\":[0.318824,0.122641,0.071761,-0.102302,-0.132654,0.329889,0.05542,0.141027,-0.16108,0.198794,0.325712,-0.049844,0.133001,0.085818,-0.067511,0.085368,0.089584,0.047502,-0.197861,0.13041,0.064883,0.095787,-0.164671,-0.055855,0.121093,0.088703,-0.008752,0.159776,-0.166059,0.386903,0.293283,0.129701],\"i35\":0.0,\"i860\":82454,\"i917\":12,\"i882\":70,\"i906\":3112,\"i813\":846,\"i930\":[-0.164454,-0.32582,0.146186,-0.426644,-0.153903,0.224564,0.056152,-0.047392,-0.032376,0.182254,0.176749,-0.122099,-0.056058,0.117358,0.043535,-0.213804,-0.007802,0.009418,0.084245,-0.032638,-0.123556,0.037904,-0.026055,0.220134,0.036264,-0.031445,0.158781,0.01302,0.073545,-0.150012,0.139681,0.051043],\"i103\":0.0,\"i43\":0.0,\"i928\":\"0.381710\",\"i903\":3,\"i106\":0.0,\"i862\":28}";

        byte[] bytes = str.getBytes(Charsets.UTF_8);
        System.out.println(bytes.length);
        Serializer serStr = new KryoSerializer(String.class);
        byte[] byteArr = new byte[4000];
        serStr.serialize(str,byteArr);




        Map<String,String> jsonObject = (Map)JSONObject.parseObject(str,new TypeReference<HashMap<String, String>>(new Type[]{String.class, String.class}) {
        });
        Serializer serStr1 = new KryoSerializer(Map.class);
        byte[] byteArr1 = new byte[4000];
        serStr1.serialize(jsonObject,byteArr1);


        String deStr = serStr.deserialize(byteArr);
        System.out.println(deStr);

        Serializer ser = new KryoSerializer(Foo.class);
        byte[] byteArr3 = new byte[300];
        ser.serialize(new Foo("foo", 1),byteArr3);

        System.out.println(byteArr1);


        FeaturePojo featurePojo = JSONObject.parseObject(str,FeaturePojo.class);
        byte[] byteArr2 = new byte[4000];
        ser.serialize(featurePojo,byteArr2);
        System.out.println(byteArr2.length);


        /*for (int i = 0; i < 1; i++) {

            Msg msg = new Msg();

           *//* msg.setVersion_flag(new byte[]{1, 2, 3});
            msg.setCrc_code((short) 1);
            msg.setMsg_body(new byte[]{123, 123, 123, 43, 42, 1, 12, 45, 57, 98});*//*
           msg.setVersionFlag("123");
           msg.setCrcCode("1");
           msg.setMsgBody("123456789");
            byte[] bytes = new byte[300];
            long start = System.nanoTime();
            ser.serialize(msg, bytes);
            System.err.println("序列化耗时：" + (System.nanoTime() - start));
            System.out.println(msg);
            System.out.println(Arrays.toString(bytes));

            Msg newmsg = null;
            start = System.nanoTime();
            newmsg = ser.deserialize(bytes);
            System.err.println("反序列化耗时：" + (System.nanoTime() - start));
            System.out.println(newmsg);
        }*/
    }

}
