
import servce.service;

public class TestTemp {
    @org.junit.Test
    public void test() {
        String PhoneNumb = "0756110";
        String pwd = "654321";
        System.out.println(service.login(PhoneNumb, pwd));
    }
}
