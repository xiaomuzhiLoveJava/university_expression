package pojo;

import java.util.ArrayList;

public class DileverMan {
    String PhoneNumb;
    String pwd;
    String name;
    String property;
    ArrayList<Commodity> commodities;

    public DileverMan(String ID, String pwd, String name, String phoneNumb, ArrayList<Commodity> commodities) {
        this.pwd = pwd;
        this.property = "2";
        this.name = name;
        this.PhoneNumb = phoneNumb;
        this.commodities = new ArrayList<Commodity>();
    }

    public DileverMan() {
        this.commodities = new ArrayList<Commodity>();
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
