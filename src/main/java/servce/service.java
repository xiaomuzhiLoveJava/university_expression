package servce;

import Dao.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import java.util.HashMap;

public class service {

    static ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
    static UserMapper mapper = context.getBean("userMapper", UserMapper.class);

    public static boolean login(String PhoneNumb,String pwd){
        HashMap<String, String> map = new HashMap<>();
        map.put("PhoneNumb",PhoneNumb);
        map.put("pwd",pwd);
        int res = mapper.loginJudge(map);
        System.out.println("===res====="+res);
        return res==2;
    }

    public boolean Registration(Student student){

        return false;
    }
/*
    public boolean ChangeInformation(Student student){}

    public boolean DistributeGoods(HashMap<String,String> map){}

    public ArrayList<Commodity> StuGetCommodities(Student student){}

    public ArrayList<Commodity> DilGetCommodities(DileverMan dileverMan){}*/
}
