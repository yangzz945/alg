package com.yyh.kryo;
/*     
 created by yangzhizhong at 2018/10/15   
 */

public class Msg {
    private String versionFlag;
    private String crcCode;
    private String msgBody;

    public String getVersionFlag() {
        return versionFlag;
    }

    public void setVersionFlag(String versionFlag) {
        this.versionFlag = versionFlag;
    }

    public String getCrcCode() {
        return crcCode;
    }

    public void setCrcCode(String crcCode) {
        this.crcCode = crcCode;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }
}
