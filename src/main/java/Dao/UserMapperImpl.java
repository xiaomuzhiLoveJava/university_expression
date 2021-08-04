package Dao;

import Dao.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import pojo.Commodity;
import pojo.DileverMan;
import pojo.Student;
import pojo.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public HashMap<String,Integer> loginJudge(HashMap map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> res = mapper.loginJudge(map);
        return res;
    }

    public boolean Registration(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.Registration(user);
        return res;
    }

    public boolean ChangeInformation(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.ChangeInformation(user);
        return res;
    }


    public boolean DistributeGoods(HashMap<String, String> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.DistributeGoods(map);
        return res;
    }

    public ArrayList<Commodity> StuGetCommodities(String PhoneNumb) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Commodity> res = mapper.StuGetCommodities(PhoneNumb);
        return res;
    }

    public ArrayList<Commodity> DilGetCommodities(String senderID) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Commodity> res = mapper.DilGetCommodities(senderID);
        return res;
    }

    @Override
    public boolean setTakingCode(HashMap<String, String> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.setTakingCode(map);
        return res;
    }

    @Override
    public ArrayList<Commodity> queryAll() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Commodity> res = mapper.queryAll();
        return res;
    }

    @Override
    public HashMap<String,String> getUser(String PhoneNumb) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,String> user = mapper.getUser(PhoneNumb);
        return user;
    }

    @Override
    public boolean takein(HashMap<String,String> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.takein(map);
    }

    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }
}