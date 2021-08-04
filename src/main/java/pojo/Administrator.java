package pojo;

public class Administrator implements User {
    String name;
    String pwd;
    String phoneNumb;
    int property;

    public Administrator( String name,String pwd, String phoneNumb) {
        this.name = name;
        this.pwd = pwd;
        this.phoneNumb = phoneNumb;
        this.property = 1;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumb() {
        return phoneNumb;
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
    }
}
