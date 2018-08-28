package com.yyh.jdk.pojo;

/**
 * Created by youku on 2018/6/1.
 */
public class Config  implements  Cloneable {
    private int num;
    private String name;

    public Config(int num,String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Config config = new Config(1,"yangzz");
        try {
            Config configClone = (Config) config.clone();
            System.out.println("config:"+config);
            System.out.println("configClone:"+configClone);

            System.out.println(config.getName()==configClone.getName());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append("@Config{");
        sb.append("num=").append(num);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
