package pojo;

import java.util.Date;

public class Commodity {
    String name;
    Student owner;
    String id;
    DileverMan sender;
    Date arriveDate;
    Date recevieDate;

    public Commodity(String name,String PhoneNumb,String pwd, Date arriveDate, Date recevieDate) {
        this.name = name;
        this.owner.PhoneNumb = PhoneNumb;
        this.id = pwd;
        this.arriveDate = arriveDate;
        this.recevieDate = recevieDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public void setRecevieDate(Date recevieDate) {
        this.recevieDate = recevieDate;
    }

    public String getName() {
        return name;
    }

    public Student getOwner() {
        return owner;
    }

    public DileverMan getSender() {
        return sender;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public Date getRecevieDate() {
        return recevieDate;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public void setPwd(String pwd) {
        this.id = pwd;
    }

    public void setSender(String senderPhoneNumb) {
        this.sender.PhoneNumb = senderPhoneNumb;
    }
}
