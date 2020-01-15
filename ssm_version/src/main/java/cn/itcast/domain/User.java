package cn.itcast.domain;

public class User {

    private Integer id;
    private String name;
    private Integer gender;
    private Integer did;
    private String advice;
    private String genderStr;
    private String didStr;

    public String getGenderStr() {
        if (gender==0)
            genderStr="女";
        else genderStr="男";
        return genderStr;
    }

    public void setGenderStr(String genderStr) {
        this.genderStr = genderStr;
    }

    public String getDidStr() {
        if (did==0)
            didStr="外科";
        else if (did==1)
            didStr="内科";
        else didStr="妇科";
        return didStr;
    }

    public void setDidStr(String didStr) {
        this.didStr = didStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", did=" + did +
                ", advice='" + advice + '\'' +
                ", genderStr='" + genderStr + '\'' +
                ", didStr='" + didStr + '\'' +
                '}';
    }
}
