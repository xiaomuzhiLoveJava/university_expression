package Dao;

import pojo.Commodity;
import pojo.DileverMan;
import pojo.Student;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserMapper {

    public int loginJudge(HashMap<String,String> map);

    public boolean Registration(Student student);

    public boolean ChangeInformation(Student student);

    public boolean DistributeGoods(HashMap<String,String> map);

    public ArrayList<Commodity> StuGetCommodities(Student student);

    public ArrayList<Commodity> DilGetCommodities(DileverMan dileverMan);

}
