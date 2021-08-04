package servce;

import Dao.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class service {


    static ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
    static UserMapper mapper = context.getBean("userMapper", UserMapper.class);

    public static int login(String PhoneNumb,String pwd){
        HashMap<String, String> map = new HashMap<>();
        map.put("PhoneNumb",PhoneNumb);
        map.put("pwd",pwd);
        HashMap<String,Integer> res = mapper.loginJudge(map);
        if(res == null) return 0;
        return res.get("property");
    }

    public static boolean Registration(User user){
        boolean res = mapper.Registration(user);
        return res;
    }

    public static ArrayList<Commodity> StuGetCommodities(String PhoneNumb){
        ArrayList<Commodity> commodities = mapper.StuGetCommodities(PhoneNumb);
        return  commodities;
    }

    public static boolean ChangeInformation(User user){
        boolean res = mapper.ChangeInformation(user);
        return res;
    }
    public static boolean DistributeGoods(String ID,String senderID,String place){
        HashMap<String,String> map = new HashMap<>();
        Date date = new Date(System.currentTimeMillis());
        map.put("arriveDate", String.valueOf(date));
        map.put("senderID",senderID);
        map.put("place",place);
        map.put("ID",ID);
        boolean res = mapper.DistributeGoods(map);
        return res;
    }
    public static ArrayList<Commodity> DilGetCommodities(String senderID){
        ArrayList<Commodity> commodities = mapper.DilGetCommodities(senderID);
        return commodities;
    }

    public static boolean setTakingCode(String id){
        HashMap<String, String> map = new HashMap<>();
        Date date = new Date(System.currentTimeMillis());
        System.out.println(String.valueOf(date));
        return true;
    }

    public static ArrayList<Commodity> queryAll(){
        ArrayList<Commodity> commodities = mapper.queryAll();
        return commodities;
    }

    public static User getUser(String str){
        HashMap<String,String> user = mapper.getUser(str);
        System.out.println("**********:"+String.valueOf(user.get("property")));
        if("1".equals(String.valueOf(user.get("property"))))
            return new Administrator(user.get("name"),user.get("pwd"),user.get("PhoneNumb"));
        else if("2".equals(String.valueOf(user.get("property"))))
            return new Student(user.get("pwd"),user.get("name"),user.get("PhoneNumb"),String.valueOf(user.get("RoomNumb")));
        else
            return new DileverMan(String.valueOf(user.get("RoomNumb")),user.get("pwd"),user.get("name"),user.get("PhoneNumb"),new ArrayList<>());
    }

    public static boolean takein(String id){
        HashMap<String, String> map = new HashMap<>();
        Date date = new Date(System.currentTimeMillis());
        map.put("id",id);
        map.put("receiveDate",String.valueOf(date));
        return mapper.takein(map);
    }
}
