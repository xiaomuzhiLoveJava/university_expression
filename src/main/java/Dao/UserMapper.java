package Dao;

import pojo.Commodity;
import pojo.DileverMan;
import pojo.Student;
import pojo.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserMapper {

    public HashMap<String,Integer> loginJudge(HashMap<String,String> map);

    public boolean Registration(User user);

    public boolean ChangeInformation(User user);

    public boolean DistributeGoods(HashMap<String,String> map);

    public ArrayList<Commodity> StuGetCommodities(String PhoneNumb);

    public ArrayList<Commodity> DilGetCommodities(String senderID);

    public boolean setTakingCode(HashMap<String,String> map);

    public ArrayList<Commodity> queryAll();

    public HashMap<String,String> getUser(String PhoneNumb);

    public boolean takein(HashMap<String,String> map);
}
