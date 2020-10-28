
package com.yyh.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "i82",
        "i934",
        "i898",
        "i11",
        "i910",
        "i558",
        "i159",
        "i5",
        "i111",
        "i921",
        "i122",
        "i36",
        "i47",
        "i902",
        "i79",
        "i570",
        "i814",
        "i107",
        "i927",
        "i9",
        "i916",
        "i75",
        "i72",
        "i853",
        "i150",
        "i104",
        "i905",
        "i42",
        "i933",
        "i875",
        "i15",
        "i869",
        "i109",
        "i922",
        "i863",
        "i892",
        "i881",
        "i37",
        "i909",
        "i155",
        "i812",
        "i78",
        "i904",
        "i12",
        "i45",
        "i48",
        "i4",
        "i874",
        "i110",
        "i144",
        "i147",
        "i158",
        "i915",
        "i121",
        "i136",
        "i472",
        "i8",
        "i895",
        "i878",
        "i133",
        "i848",
        "i108",
        "i901",
        "i80",
        "i471",
        "i919",
        "i859",
        "i889",
        "i891",
        "i33",
        "i41",
        "i16",
        "i815",
        "i856",
        "i76",
        "i44",
        "i13",
        "i851",
        "i38",
        "i556",
        "i77",
        "i141",
        "i873",
        "i871",
        "i146",
        "i849",
        "i135",
        "i872",
        "i40",
        "i931",
        "i888",
        "i877",
        "i73",
        "i81",
        "i896",
        "i123",
        "i105",
        "i918",
        "i557",
        "i855",
        "i112",
        "i34",
        "i2",
        "i883",
        "i10",
        "i944",
        "i142",
        "i156",
        "i134",
        "i850",
        "i810",
        "i920",
        "i861",
        "i890",
        "i39",
        "i854",
        "i124",
        "i74",
        "i887",
        "i46",
        "i876",
        "i865",
        "i149",
        "i35",
        "i860",
        "i917",
        "i882",
        "i906",
        "i813",
        "i930",
        "i103",
        "i43",
        "i928",
        "i903",
        "i106",
        "i862"
})
public class FeaturePojo {

    @JsonProperty("i82")
    private Double i82;
    @JsonProperty("i934")
    private String i934;
    @JsonProperty("i898")
    private Integer i898;
    @JsonProperty("i11")
    private String i11;
    @JsonProperty("i910")
    private Integer i910;
    @JsonProperty("i558")
    private String i558;
    @JsonProperty("i159")
    private String i159;
    @JsonProperty("i5")
    private Integer i5;
    @JsonProperty("i111")
    private Double i111;
    @JsonProperty("i921")
    private Integer i921;
    @JsonProperty("i122")
    private Double i122;
    @JsonProperty("i36")
    private Double i36;
    @JsonProperty("i47")
    private Double i47;
    @JsonProperty("i902")
    private Integer i902;
    @JsonProperty("i79")
    private Double i79;
    @JsonProperty("i570")
    private Integer i570;
    @JsonProperty("i814")
    private Integer i814;
    @JsonProperty("i107")
    private Double i107;
    @JsonProperty("i927")
    private List<Double> i927 = null;
    @JsonProperty("i9")
    private String i9;
    @JsonProperty("i916")
    private Integer i916;
    @JsonProperty("i75")
    private Double i75;
    @JsonProperty("i72")
    private Double i72;
    @JsonProperty("i853")
    private Integer i853;
    @JsonProperty("i150")
    private String i150;
    @JsonProperty("i104")
    private Double i104;
    @JsonProperty("i905")
    private Integer i905;
    @JsonProperty("i42")
    private Double i42;
    @JsonProperty("i933")
    private List<Double> i933 = null;
    @JsonProperty("i875")
    private Integer i875;
    @JsonProperty("i15")
    private String i15;
    @JsonProperty("i869")
    private Integer i869;
    @JsonProperty("i109")
    private Double i109;
    @JsonProperty("i922")
    private Integer i922;
    @JsonProperty("i863")
    private Integer i863;
    @JsonProperty("i892")
    private Integer i892;
    @JsonProperty("i881")
    private Integer i881;
    @JsonProperty("i37")
    private Double i37;
    @JsonProperty("i909")
    private Integer i909;
    @JsonProperty("i155")
    private List<Double> i155 = null;
    @JsonProperty("i812")
    private Integer i812;
    @JsonProperty("i78")
    private Double i78;
    @JsonProperty("i904")
    private Integer i904;
    @JsonProperty("i12")
    private String i12;
    @JsonProperty("i45")
    private Double i45;
    @JsonProperty("i48")
    private Double i48;
    @JsonProperty("i4")
    private Integer i4;
    @JsonProperty("i874")
    private Integer i874;
    @JsonProperty("i110")
    private Double i110;
    @JsonProperty("i144")
    private List<Double> i144 = null;
    @JsonProperty("i147")
    private String i147;
    @JsonProperty("i158")
    private List<Double> i158 = null;
    @JsonProperty("i915")
    private Integer i915;
    @JsonProperty("i121")
    private Double i121;
    @JsonProperty("i136")
    private Double i136;
    @JsonProperty("i472")
    private String i472;
    @JsonProperty("i8")
    private String i8;
    @JsonProperty("i895")
    private Integer i895;
    @JsonProperty("i878")
    private Integer i878;
    @JsonProperty("i133")
    private Double i133;
    @JsonProperty("i848")
    private Integer i848;
    @JsonProperty("i108")
    private Double i108;
    @JsonProperty("i901")
    private Integer i901;
    @JsonProperty("i80")
    private Double i80;
    @JsonProperty("i471")
    private String i471;
    @JsonProperty("i919")
    private Integer i919;
    @JsonProperty("i859")
    private Integer i859;
    @JsonProperty("i889")
    private Integer i889;
    @JsonProperty("i891")
    private Integer i891;
    @JsonProperty("i33")
    private Double i33;
    @JsonProperty("i41")
    private Double i41;
    @JsonProperty("i16")
    private List<Object> i16 = null;
    @JsonProperty("i815")
    private Integer i815;
    @JsonProperty("i856")
    private Integer i856;
    @JsonProperty("i76")
    private Double i76;
    @JsonProperty("i44")
    private Double i44;
    @JsonProperty("i13")
    private String i13;
    @JsonProperty("i851")
    private Integer i851;
    @JsonProperty("i38")
    private Double i38;
    @JsonProperty("i556")
    private String i556;
    @JsonProperty("i77")
    private Double i77;
    @JsonProperty("i141")
    private List<Double> i141 = null;
    @JsonProperty("i873")
    private Integer i873;
    @JsonProperty("i871")
    private Integer i871;
    @JsonProperty("i146")
    private List<Double> i146 = null;
    @JsonProperty("i849")
    private Integer i849;
    @JsonProperty("i135")
    private Double i135;
    @JsonProperty("i872")
    private Integer i872;
    @JsonProperty("i40")
    private Double i40;
    @JsonProperty("i931")
    private String i931;
    @JsonProperty("i888")
    private Integer i888;
    @JsonProperty("i877")
    private Integer i877;
    @JsonProperty("i73")
    private Double i73;
    @JsonProperty("i81")
    private Double i81;
    @JsonProperty("i896")
    private Integer i896;
    @JsonProperty("i123")
    private Double i123;
    @JsonProperty("i105")
    private Double i105;
    @JsonProperty("i918")
    private Integer i918;
    @JsonProperty("i557")
    private String i557;
    @JsonProperty("i855")
    private Integer i855;
    @JsonProperty("i112")
    private Double i112;
    @JsonProperty("i34")
    private Double i34;
    @JsonProperty("i2")
    private Integer i2;
    @JsonProperty("i883")
    private Integer i883;
    @JsonProperty("i10")
    private Integer i10;
    @JsonProperty("i944")
    private Double i944;
    @JsonProperty("i142")
    private String i142;
    @JsonProperty("i156")
    private String i156;
    @JsonProperty("i134")
    private Double i134;
    @JsonProperty("i850")
    private Integer i850;
    @JsonProperty("i810")
    private String i810;
    @JsonProperty("i920")
    private Integer i920;
    @JsonProperty("i861")
    private Integer i861;
    @JsonProperty("i890")
    private Integer i890;
    @JsonProperty("i39")
    private Double i39;
    @JsonProperty("i854")
    private Integer i854;
    @JsonProperty("i124")
    private Double i124;
    @JsonProperty("i74")
    private Double i74;
    @JsonProperty("i887")
    private Integer i887;
    @JsonProperty("i46")
    private Double i46;
    @JsonProperty("i876")
    private Integer i876;
    @JsonProperty("i865")
    private Integer i865;
    @JsonProperty("i149")
    private List<Double> i149 = null;
    @JsonProperty("i35")
    private Double i35;
    @JsonProperty("i860")
    private Integer i860;
    @JsonProperty("i917")
    private Integer i917;
    @JsonProperty("i882")
    private Integer i882;
    @JsonProperty("i906")
    private Integer i906;
    @JsonProperty("i813")
    private Integer i813;
    @JsonProperty("i930")
    private List<Double> i930 = null;
    @JsonProperty("i103")
    private Double i103;
    @JsonProperty("i43")
    private Double i43;
    @JsonProperty("i928")
    private String i928;
    @JsonProperty("i903")
    private Integer i903;
    @JsonProperty("i106")
    private Double i106;
    @JsonProperty("i862")
    private Integer i862;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("i82")
    public Double getI82() {
        return i82;
    }

    @JsonProperty("i82")
    public void setI82(Double i82) {
        this.i82 = i82;
    }

    @JsonProperty("i934")
    public String getI934() {
        return i934;
    }

    @JsonProperty("i934")
    public void setI934(String i934) {
        this.i934 = i934;
    }

    @JsonProperty("i898")
    public Integer getI898() {
        return i898;
    }

    @JsonProperty("i898")
    public void setI898(Integer i898) {
        this.i898 = i898;
    }

    @JsonProperty("i11")
    public String getI11() {
        return i11;
    }

    @JsonProperty("i11")
    public void setI11(String i11) {
        this.i11 = i11;
    }

    @JsonProperty("i910")
    public Integer getI910() {
        return i910;
    }

    @JsonProperty("i910")
    public void setI910(Integer i910) {
        this.i910 = i910;
    }

    @JsonProperty("i558")
    public String getI558() {
        return i558;
    }

    @JsonProperty("i558")
    public void setI558(String i558) {
        this.i558 = i558;
    }

    @JsonProperty("i159")
    public String getI159() {
        return i159;
    }

    @JsonProperty("i159")
    public void setI159(String i159) {
        this.i159 = i159;
    }

    @JsonProperty("i5")
    public Integer getI5() {
        return i5;
    }

    @JsonProperty("i5")
    public void setI5(Integer i5) {
        this.i5 = i5;
    }

    @JsonProperty("i111")
    public Double getI111() {
        return i111;
    }

    @JsonProperty("i111")
    public void setI111(Double i111) {
        this.i111 = i111;
    }

    @JsonProperty("i921")
    public Integer getI921() {
        return i921;
    }

    @JsonProperty("i921")
    public void setI921(Integer i921) {
        this.i921 = i921;
    }

    @JsonProperty("i122")
    public Double getI122() {
        return i122;
    }

    @JsonProperty("i122")
    public void setI122(Double i122) {
        this.i122 = i122;
    }

    @JsonProperty("i36")
    public Double getI36() {
        return i36;
    }

    @JsonProperty("i36")
    public void setI36(Double i36) {
        this.i36 = i36;
    }

    @JsonProperty("i47")
    public Double getI47() {
        return i47;
    }

    @JsonProperty("i47")
    public void setI47(Double i47) {
        this.i47 = i47;
    }

    @JsonProperty("i902")
    public Integer getI902() {
        return i902;
    }

    @JsonProperty("i902")
    public void setI902(Integer i902) {
        this.i902 = i902;
    }

    @JsonProperty("i79")
    public Double getI79() {
        return i79;
    }

    @JsonProperty("i79")
    public void setI79(Double i79) {
        this.i79 = i79;
    }

    @JsonProperty("i570")
    public Integer getI570() {
        return i570;
    }

    @JsonProperty("i570")
    public void setI570(Integer i570) {
        this.i570 = i570;
    }

    @JsonProperty("i814")
    public Integer getI814() {
        return i814;
    }

    @JsonProperty("i814")
    public void setI814(Integer i814) {
        this.i814 = i814;
    }

    @JsonProperty("i107")
    public Double getI107() {
        return i107;
    }

    @JsonProperty("i107")
    public void setI107(Double i107) {
        this.i107 = i107;
    }

    @JsonProperty("i927")
    public List<Double> getI927() {
        return i927;
    }

    @JsonProperty("i927")
    public void setI927(List<Double> i927) {
        this.i927 = i927;
    }

    @JsonProperty("i9")
    public String getI9() {
        return i9;
    }

    @JsonProperty("i9")
    public void setI9(String i9) {
        this.i9 = i9;
    }

    @JsonProperty("i916")
    public Integer getI916() {
        return i916;
    }

    @JsonProperty("i916")
    public void setI916(Integer i916) {
        this.i916 = i916;
    }

    @JsonProperty("i75")
    public Double getI75() {
        return i75;
    }

    @JsonProperty("i75")
    public void setI75(Double i75) {
        this.i75 = i75;
    }

    @JsonProperty("i72")
    public Double getI72() {
        return i72;
    }

    @JsonProperty("i72")
    public void setI72(Double i72) {
        this.i72 = i72;
    }

    @JsonProperty("i853")
    public Integer getI853() {
        return i853;
    }

    @JsonProperty("i853")
    public void setI853(Integer i853) {
        this.i853 = i853;
    }

    @JsonProperty("i150")
    public String getI150() {
        return i150;
    }

    @JsonProperty("i150")
    public void setI150(String i150) {
        this.i150 = i150;
    }

    @JsonProperty("i104")
    public Double getI104() {
        return i104;
    }

    @JsonProperty("i104")
    public void setI104(Double i104) {
        this.i104 = i104;
    }

    @JsonProperty("i905")
    public Integer getI905() {
        return i905;
    }

    @JsonProperty("i905")
    public void setI905(Integer i905) {
        this.i905 = i905;
    }

    @JsonProperty("i42")
    public Double getI42() {
        return i42;
    }

    @JsonProperty("i42")
    public void setI42(Double i42) {
        this.i42 = i42;
    }

    @JsonProperty("i933")
    public List<Double> getI933() {
        return i933;
    }

    @JsonProperty("i933")
    public void setI933(List<Double> i933) {
        this.i933 = i933;
    }

    @JsonProperty("i875")
    public Integer getI875() {
        return i875;
    }

    @JsonProperty("i875")
    public void setI875(Integer i875) {
        this.i875 = i875;
    }

    @JsonProperty("i15")
    public String getI15() {
        return i15;
    }

    @JsonProperty("i15")
    public void setI15(String i15) {
        this.i15 = i15;
    }

    @JsonProperty("i869")
    public Integer getI869() {
        return i869;
    }

    @JsonProperty("i869")
    public void setI869(Integer i869) {
        this.i869 = i869;
    }

    @JsonProperty("i109")
    public Double getI109() {
        return i109;
    }

    @JsonProperty("i109")
    public void setI109(Double i109) {
        this.i109 = i109;
    }

    @JsonProperty("i922")
    public Integer getI922() {
        return i922;
    }

    @JsonProperty("i922")
    public void setI922(Integer i922) {
        this.i922 = i922;
    }

    @JsonProperty("i863")
    public Integer getI863() {
        return i863;
    }

    @JsonProperty("i863")
    public void setI863(Integer i863) {
        this.i863 = i863;
    }

    @JsonProperty("i892")
    public Integer getI892() {
        return i892;
    }

    @JsonProperty("i892")
    public void setI892(Integer i892) {
        this.i892 = i892;
    }

    @JsonProperty("i881")
    public Integer getI881() {
        return i881;
    }

    @JsonProperty("i881")
    public void setI881(Integer i881) {
        this.i881 = i881;
    }

    @JsonProperty("i37")
    public Double getI37() {
        return i37;
    }

    @JsonProperty("i37")
    public void setI37(Double i37) {
        this.i37 = i37;
    }

    @JsonProperty("i909")
    public Integer getI909() {
        return i909;
    }

    @JsonProperty("i909")
    public void setI909(Integer i909) {
        this.i909 = i909;
    }

    @JsonProperty("i155")
    public List<Double> getI155() {
        return i155;
    }

    @JsonProperty("i155")
    public void setI155(List<Double> i155) {
        this.i155 = i155;
    }

    @JsonProperty("i812")
    public Integer getI812() {
        return i812;
    }

    @JsonProperty("i812")
    public void setI812(Integer i812) {
        this.i812 = i812;
    }

    @JsonProperty("i78")
    public Double getI78() {
        return i78;
    }

    @JsonProperty("i78")
    public void setI78(Double i78) {
        this.i78 = i78;
    }

    @JsonProperty("i904")
    public Integer getI904() {
        return i904;
    }

    @JsonProperty("i904")
    public void setI904(Integer i904) {
        this.i904 = i904;
    }

    @JsonProperty("i12")
    public String getI12() {
        return i12;
    }

    @JsonProperty("i12")
    public void setI12(String i12) {
        this.i12 = i12;
    }

    @JsonProperty("i45")
    public Double getI45() {
        return i45;
    }

    @JsonProperty("i45")
    public void setI45(Double i45) {
        this.i45 = i45;
    }

    @JsonProperty("i48")
    public Double getI48() {
        return i48;
    }

    @JsonProperty("i48")
    public void setI48(Double i48) {
        this.i48 = i48;
    }

    @JsonProperty("i4")
    public Integer getI4() {
        return i4;
    }

    @JsonProperty("i4")
    public void setI4(Integer i4) {
        this.i4 = i4;
    }

    @JsonProperty("i874")
    public Integer getI874() {
        return i874;
    }

    @JsonProperty("i874")
    public void setI874(Integer i874) {
        this.i874 = i874;
    }

    @JsonProperty("i110")
    public Double getI110() {
        return i110;
    }

    @JsonProperty("i110")
    public void setI110(Double i110) {
        this.i110 = i110;
    }

    @JsonProperty("i144")
    public List<Double> getI144() {
        return i144;
    }

    @JsonProperty("i144")
    public void setI144(List<Double> i144) {
        this.i144 = i144;
    }

    @JsonProperty("i147")
    public String getI147() {
        return i147;
    }

    @JsonProperty("i147")
    public void setI147(String i147) {
        this.i147 = i147;
    }

    @JsonProperty("i158")
    public List<Double> getI158() {
        return i158;
    }

    @JsonProperty("i158")
    public void setI158(List<Double> i158) {
        this.i158 = i158;
    }

    @JsonProperty("i915")
    public Integer getI915() {
        return i915;
    }

    @JsonProperty("i915")
    public void setI915(Integer i915) {
        this.i915 = i915;
    }

    @JsonProperty("i121")
    public Double getI121() {
        return i121;
    }

    @JsonProperty("i121")
    public void setI121(Double i121) {
        this.i121 = i121;
    }

    @JsonProperty("i136")
    public Double getI136() {
        return i136;
    }

    @JsonProperty("i136")
    public void setI136(Double i136) {
        this.i136 = i136;
    }

    @JsonProperty("i472")
    public String getI472() {
        return i472;
    }

    @JsonProperty("i472")
    public void setI472(String i472) {
        this.i472 = i472;
    }

    @JsonProperty("i8")
    public String getI8() {
        return i8;
    }

    @JsonProperty("i8")
    public void setI8(String i8) {
        this.i8 = i8;
    }

    @JsonProperty("i895")
    public Integer getI895() {
        return i895;
    }

    @JsonProperty("i895")
    public void setI895(Integer i895) {
        this.i895 = i895;
    }

    @JsonProperty("i878")
    public Integer getI878() {
        return i878;
    }

    @JsonProperty("i878")
    public void setI878(Integer i878) {
        this.i878 = i878;
    }

    @JsonProperty("i133")
    public Double getI133() {
        return i133;
    }

    @JsonProperty("i133")
    public void setI133(Double i133) {
        this.i133 = i133;
    }

    @JsonProperty("i848")
    public Integer getI848() {
        return i848;
    }

    @JsonProperty("i848")
    public void setI848(Integer i848) {
        this.i848 = i848;
    }

    @JsonProperty("i108")
    public Double getI108() {
        return i108;
    }

    @JsonProperty("i108")
    public void setI108(Double i108) {
        this.i108 = i108;
    }

    @JsonProperty("i901")
    public Integer getI901() {
        return i901;
    }

    @JsonProperty("i901")
    public void setI901(Integer i901) {
        this.i901 = i901;
    }

    @JsonProperty("i80")
    public Double getI80() {
        return i80;
    }

    @JsonProperty("i80")
    public void setI80(Double i80) {
        this.i80 = i80;
    }

    @JsonProperty("i471")
    public String getI471() {
        return i471;
    }

    @JsonProperty("i471")
    public void setI471(String i471) {
        this.i471 = i471;
    }

    @JsonProperty("i919")
    public Integer getI919() {
        return i919;
    }

    @JsonProperty("i919")
    public void setI919(Integer i919) {
        this.i919 = i919;
    }

    @JsonProperty("i859")
    public Integer getI859() {
        return i859;
    }

    @JsonProperty("i859")
    public void setI859(Integer i859) {
        this.i859 = i859;
    }

    @JsonProperty("i889")
    public Integer getI889() {
        return i889;
    }

    @JsonProperty("i889")
    public void setI889(Integer i889) {
        this.i889 = i889;
    }

    @JsonProperty("i891")
    public Integer getI891() {
        return i891;
    }

    @JsonProperty("i891")
    public void setI891(Integer i891) {
        this.i891 = i891;
    }

    @JsonProperty("i33")
    public Double getI33() {
        return i33;
    }

    @JsonProperty("i33")
    public void setI33(Double i33) {
        this.i33 = i33;
    }

    @JsonProperty("i41")
    public Double getI41() {
        return i41;
    }

    @JsonProperty("i41")
    public void setI41(Double i41) {
        this.i41 = i41;
    }

    @JsonProperty("i16")
    public List<Object> getI16() {
        return i16;
    }

    @JsonProperty("i16")
    public void setI16(List<Object> i16) {
        this.i16 = i16;
    }

    @JsonProperty("i815")
    public Integer getI815() {
        return i815;
    }

    @JsonProperty("i815")
    public void setI815(Integer i815) {
        this.i815 = i815;
    }

    @JsonProperty("i856")
    public Integer getI856() {
        return i856;
    }

    @JsonProperty("i856")
    public void setI856(Integer i856) {
        this.i856 = i856;
    }

    @JsonProperty("i76")
    public Double getI76() {
        return i76;
    }

    @JsonProperty("i76")
    public void setI76(Double i76) {
        this.i76 = i76;
    }

    @JsonProperty("i44")
    public Double getI44() {
        return i44;
    }

    @JsonProperty("i44")
    public void setI44(Double i44) {
        this.i44 = i44;
    }

    @JsonProperty("i13")
    public String getI13() {
        return i13;
    }

    @JsonProperty("i13")
    public void setI13(String i13) {
        this.i13 = i13;
    }

    @JsonProperty("i851")
    public Integer getI851() {
        return i851;
    }

    @JsonProperty("i851")
    public void setI851(Integer i851) {
        this.i851 = i851;
    }

    @JsonProperty("i38")
    public Double getI38() {
        return i38;
    }

    @JsonProperty("i38")
    public void setI38(Double i38) {
        this.i38 = i38;
    }

    @JsonProperty("i556")
    public String getI556() {
        return i556;
    }

    @JsonProperty("i556")
    public void setI556(String i556) {
        this.i556 = i556;
    }

    @JsonProperty("i77")
    public Double getI77() {
        return i77;
    }

    @JsonProperty("i77")
    public void setI77(Double i77) {
        this.i77 = i77;
    }

    @JsonProperty("i141")
    public List<Double> getI141() {
        return i141;
    }

    @JsonProperty("i141")
    public void setI141(List<Double> i141) {
        this.i141 = i141;
    }

    @JsonProperty("i873")
    public Integer getI873() {
        return i873;
    }

    @JsonProperty("i873")
    public void setI873(Integer i873) {
        this.i873 = i873;
    }

    @JsonProperty("i871")
    public Integer getI871() {
        return i871;
    }

    @JsonProperty("i871")
    public void setI871(Integer i871) {
        this.i871 = i871;
    }

    @JsonProperty("i146")
    public List<Double> getI146() {
        return i146;
    }

    @JsonProperty("i146")
    public void setI146(List<Double> i146) {
        this.i146 = i146;
    }

    @JsonProperty("i849")
    public Integer getI849() {
        return i849;
    }

    @JsonProperty("i849")
    public void setI849(Integer i849) {
        this.i849 = i849;
    }

    @JsonProperty("i135")
    public Double getI135() {
        return i135;
    }

    @JsonProperty("i135")
    public void setI135(Double i135) {
        this.i135 = i135;
    }

    @JsonProperty("i872")
    public Integer getI872() {
        return i872;
    }

    @JsonProperty("i872")
    public void setI872(Integer i872) {
        this.i872 = i872;
    }

    @JsonProperty("i40")
    public Double getI40() {
        return i40;
    }

    @JsonProperty("i40")
    public void setI40(Double i40) {
        this.i40 = i40;
    }

    @JsonProperty("i931")
    public String getI931() {
        return i931;
    }

    @JsonProperty("i931")
    public void setI931(String i931) {
        this.i931 = i931;
    }

    @JsonProperty("i888")
    public Integer getI888() {
        return i888;
    }

    @JsonProperty("i888")
    public void setI888(Integer i888) {
        this.i888 = i888;
    }

    @JsonProperty("i877")
    public Integer getI877() {
        return i877;
    }

    @JsonProperty("i877")
    public void setI877(Integer i877) {
        this.i877 = i877;
    }

    @JsonProperty("i73")
    public Double getI73() {
        return i73;
    }

    @JsonProperty("i73")
    public void setI73(Double i73) {
        this.i73 = i73;
    }

    @JsonProperty("i81")
    public Double getI81() {
        return i81;
    }

    @JsonProperty("i81")
    public void setI81(Double i81) {
        this.i81 = i81;
    }

    @JsonProperty("i896")
    public Integer getI896() {
        return i896;
    }

    @JsonProperty("i896")
    public void setI896(Integer i896) {
        this.i896 = i896;
    }

    @JsonProperty("i123")
    public Double getI123() {
        return i123;
    }

    @JsonProperty("i123")
    public void setI123(Double i123) {
        this.i123 = i123;
    }

    @JsonProperty("i105")
    public Double getI105() {
        return i105;
    }

    @JsonProperty("i105")
    public void setI105(Double i105) {
        this.i105 = i105;
    }

    @JsonProperty("i918")
    public Integer getI918() {
        return i918;
    }

    @JsonProperty("i918")
    public void setI918(Integer i918) {
        this.i918 = i918;
    }

    @JsonProperty("i557")
    public String getI557() {
        return i557;
    }

    @JsonProperty("i557")
    public void setI557(String i557) {
        this.i557 = i557;
    }

    @JsonProperty("i855")
    public Integer getI855() {
        return i855;
    }

    @JsonProperty("i855")
    public void setI855(Integer i855) {
        this.i855 = i855;
    }

    @JsonProperty("i112")
    public Double getI112() {
        return i112;
    }

    @JsonProperty("i112")
    public void setI112(Double i112) {
        this.i112 = i112;
    }

    @JsonProperty("i34")
    public Double getI34() {
        return i34;
    }

    @JsonProperty("i34")
    public void setI34(Double i34) {
        this.i34 = i34;
    }

    @JsonProperty("i2")
    public Integer getI2() {
        return i2;
    }

    @JsonProperty("i2")
    public void setI2(Integer i2) {
        this.i2 = i2;
    }

    @JsonProperty("i883")
    public Integer getI883() {
        return i883;
    }

    @JsonProperty("i883")
    public void setI883(Integer i883) {
        this.i883 = i883;
    }

    @JsonProperty("i10")
    public Integer getI10() {
        return i10;
    }

    @JsonProperty("i10")
    public void setI10(Integer i10) {
        this.i10 = i10;
    }

    @JsonProperty("i944")
    public Double getI944() {
        return i944;
    }

    @JsonProperty("i944")
    public void setI944(Double i944) {
        this.i944 = i944;
    }

    @JsonProperty("i142")
    public String getI142() {
        return i142;
    }

    @JsonProperty("i142")
    public void setI142(String i142) {
        this.i142 = i142;
    }

    @JsonProperty("i156")
    public String getI156() {
        return i156;
    }

    @JsonProperty("i156")
    public void setI156(String i156) {
        this.i156 = i156;
    }

    @JsonProperty("i134")
    public Double getI134() {
        return i134;
    }

    @JsonProperty("i134")
    public void setI134(Double i134) {
        this.i134 = i134;
    }

    @JsonProperty("i850")
    public Integer getI850() {
        return i850;
    }

    @JsonProperty("i850")
    public void setI850(Integer i850) {
        this.i850 = i850;
    }

    @JsonProperty("i810")
    public String getI810() {
        return i810;
    }

    @JsonProperty("i810")
    public void setI810(String i810) {
        this.i810 = i810;
    }

    @JsonProperty("i920")
    public Integer getI920() {
        return i920;
    }

    @JsonProperty("i920")
    public void setI920(Integer i920) {
        this.i920 = i920;
    }

    @JsonProperty("i861")
    public Integer getI861() {
        return i861;
    }

    @JsonProperty("i861")
    public void setI861(Integer i861) {
        this.i861 = i861;
    }

    @JsonProperty("i890")
    public Integer getI890() {
        return i890;
    }

    @JsonProperty("i890")
    public void setI890(Integer i890) {
        this.i890 = i890;
    }

    @JsonProperty("i39")
    public Double getI39() {
        return i39;
    }

    @JsonProperty("i39")
    public void setI39(Double i39) {
        this.i39 = i39;
    }

    @JsonProperty("i854")
    public Integer getI854() {
        return i854;
    }

    @JsonProperty("i854")
    public void setI854(Integer i854) {
        this.i854 = i854;
    }

    @JsonProperty("i124")
    public Double getI124() {
        return i124;
    }

    @JsonProperty("i124")
    public void setI124(Double i124) {
        this.i124 = i124;
    }

    @JsonProperty("i74")
    public Double getI74() {
        return i74;
    }

    @JsonProperty("i74")
    public void setI74(Double i74) {
        this.i74 = i74;
    }

    @JsonProperty("i887")
    public Integer getI887() {
        return i887;
    }

    @JsonProperty("i887")
    public void setI887(Integer i887) {
        this.i887 = i887;
    }

    @JsonProperty("i46")
    public Double getI46() {
        return i46;
    }

    @JsonProperty("i46")
    public void setI46(Double i46) {
        this.i46 = i46;
    }

    @JsonProperty("i876")
    public Integer getI876() {
        return i876;
    }

    @JsonProperty("i876")
    public void setI876(Integer i876) {
        this.i876 = i876;
    }

    @JsonProperty("i865")
    public Integer getI865() {
        return i865;
    }

    @JsonProperty("i865")
    public void setI865(Integer i865) {
        this.i865 = i865;
    }

    @JsonProperty("i149")
    public List<Double> getI149() {
        return i149;
    }

    @JsonProperty("i149")
    public void setI149(List<Double> i149) {
        this.i149 = i149;
    }

    @JsonProperty("i35")
    public Double getI35() {
        return i35;
    }

    @JsonProperty("i35")
    public void setI35(Double i35) {
        this.i35 = i35;
    }

    @JsonProperty("i860")
    public Integer getI860() {
        return i860;
    }

    @JsonProperty("i860")
    public void setI860(Integer i860) {
        this.i860 = i860;
    }

    @JsonProperty("i917")
    public Integer getI917() {
        return i917;
    }

    @JsonProperty("i917")
    public void setI917(Integer i917) {
        this.i917 = i917;
    }

    @JsonProperty("i882")
    public Integer getI882() {
        return i882;
    }

    @JsonProperty("i882")
    public void setI882(Integer i882) {
        this.i882 = i882;
    }

    @JsonProperty("i906")
    public Integer getI906() {
        return i906;
    }

    @JsonProperty("i906")
    public void setI906(Integer i906) {
        this.i906 = i906;
    }

    @JsonProperty("i813")
    public Integer getI813() {
        return i813;
    }

    @JsonProperty("i813")
    public void setI813(Integer i813) {
        this.i813 = i813;
    }

    @JsonProperty("i930")
    public List<Double> getI930() {
        return i930;
    }

    @JsonProperty("i930")
    public void setI930(List<Double> i930) {
        this.i930 = i930;
    }

    @JsonProperty("i103")
    public Double getI103() {
        return i103;
    }

    @JsonProperty("i103")
    public void setI103(Double i103) {
        this.i103 = i103;
    }

    @JsonProperty("i43")
    public Double getI43() {
        return i43;
    }

    @JsonProperty("i43")
    public void setI43(Double i43) {
        this.i43 = i43;
    }

    @JsonProperty("i928")
    public String getI928() {
        return i928;
    }

    @JsonProperty("i928")
    public void setI928(String i928) {
        this.i928 = i928;
    }

    @JsonProperty("i903")
    public Integer getI903() {
        return i903;
    }

    @JsonProperty("i903")
    public void setI903(Integer i903) {
        this.i903 = i903;
    }

    @JsonProperty("i106")
    public Double getI106() {
        return i106;
    }

    @JsonProperty("i106")
    public void setI106(Double i106) {
        this.i106 = i106;
    }

    @JsonProperty("i862")
    public Integer getI862() {
        return i862;
    }

    @JsonProperty("i862")
    public void setI862(Integer i862) {
        this.i862 = i862;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
