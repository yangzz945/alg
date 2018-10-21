package com.yyh.kryo;
/*     
 created by yangzhizhong at 2018/10/15   
 */

public interface Serializer {
    public void serialize(Object t,byte[] bytes);

    /**
     * 序列化
     * @param obj
     * @param bytes
     * @param offset
     * @param count
     */
    public void serialize(Object obj, byte[] bytes, int offset, int count);

    /**
     * 反序列化
     * @param bytes -字节数组
     * @return T<T>
     */
    public <T>T deserialize(byte[] bytes);


    /**
     * 反序列化
     * @param bytes
     * @param offset
     * @param count
     * @return
     */
    public <T>T deserialize(byte[] bytes, int offset, int count);


}
