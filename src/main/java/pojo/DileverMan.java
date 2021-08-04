package pojo;

import java.util.ArrayList;

public class DileverMan implements User{
    String PhoneNumb;
    String pwd;
    String name;
    String property;
    String palce;
    ArrayList<Commodity> commodities;

    public String getPwd() {
        return pwd;
    }

    public DileverMan(String palce,String pwd, String name, String phoneNumb, ArrayList<Commodity> commodities) {
        this.pwd = pwd;
        this.palce = palce;
        this.property = "2";
        this.name = name;
        this.PhoneNumb = phoneNumb;
        this.commodities = new ArrayList<Commodity>();
    }

    public void setPalce(String palce) {
        this.palce = palce;
    }

    public String getPalce() {
        return palce;
    }

    public DileverMan() {
        this.commodities = new ArrayList<Commodity>();
    }

    @Override
    public String toString() {
      return  "user" + "  "+PhoneNumb
        + "  "+pwd
        + "  "+name
        + "  "+property
        +"  "+ palce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.PhoneNumb = phoneNumb;
    }

    public void setCommodities(ArrayList<Commodity> commodities) {
        this.commodities = commodities;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumb() {
        return PhoneNumb;
    }

    public ArrayList<Commodity> getCommodities() {
        return commodities;
    }
}
