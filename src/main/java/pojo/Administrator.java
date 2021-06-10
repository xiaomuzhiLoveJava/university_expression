package pojo;

public class Administrator {
    String ID;
    String name;
    String pwd;
    String phoneNumb;
    int property;

    public Administrator(String ID, String name,String pwd, String phoneNumb) {
        this.ID = ID;
        this.name = name;
        this.pwd = pwd;
        this.phoneNumb = phoneNumb;
        this.property = 1;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSender(Commodity com,DileverMan dileverMan){
        dileverMan.commodities.add(com);
        com.setSender(dileverMan.PhoneNumb);
    }
}
