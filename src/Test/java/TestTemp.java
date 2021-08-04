
import org.junit.Test;
import pojo.Commodity;
import pojo.Student;
import pojo.User;
import servce.service;

import java.util.ArrayList;

public class TestTemp {
    @org.junit.Test
    public void test() {
        String PhoneNumb = "0756110";
        String pwd = "654321";
        System.out.println(service.login(PhoneNumb, pwd));
    }

    @Test
    public void Test2(){
        User student = new Student("123456","李子康","19800000000","1530");
        System.out.println(service.Registration(student));
    }

    @Test
    public void Test3(){
        ArrayList<Commodity> commodities = service.StuGetCommodities("19875601728");
        for (Commodity c : commodities) {
            System.out.println(c.toString());
        }
    }
    @Test
    public void Test4(){
        User user = new Student("66666","李小帅","19875601728","4530");
        boolean res = service.ChangeInformation(user);
    }
    @Test
    public void Test5(){
        boolean res = service.DistributeGoods("1","5","仓库5");
    }

    @Test
    public void Test6(){
        ArrayList<Commodity> s = service.DilGetCommodities("5");
        for (Commodity c : s) {
            System.out.println(c.toString());
        }
    }
}
