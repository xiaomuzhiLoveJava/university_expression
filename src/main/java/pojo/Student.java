package pojo;

import java.util.ArrayList;

public class Student{
    String pwd;
    String name;
    String PhoneNumb;
    String RoomNumb;
    String property;
    ArrayList<Commodity> commodities;

    public Student(String pwd, String name, String phoneNumb, String roomNumb) {
        this.pwd = pwd;
        this.name = name;
        PhoneNumb = phoneNumb;
        RoomNumb = roomNumb;
        this.commodities = new ArrayList<Commodity>();
        this.property = "2";
    }

    public Student() {
        this.commodities = new ArrayList<Commodity>();
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumb() {
        return PhoneNumb;
    }

    public String getRoomNumb() {
        return RoomNumb;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumb(String phoneNumb) {
        PhoneNumb = phoneNumb;
    }

    public void setRoomNumb(String roomNumb) {
        RoomNumb = roomNumb;
    }
}
