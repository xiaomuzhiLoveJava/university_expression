package Dao;

import Dao.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import pojo.Commodity;
import pojo.DileverMan;
import pojo.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int loginJudge(HashMap map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.loginJudge(map);
        return res;
    }

    public boolean Registration(Student student) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.Registration(student);
        return res;
    }

    public boolean ChangeInformation(Student student) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.ChangeInformation(student);
        return res;
    }

    public boolean DistributeGoods(HashMap<String, String> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean res = mapper.DistributeGoods(map);
        return res;
    }

    public ArrayList<Commodity> StuGetCommodities(Student student) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Commodity> res = mapper.StuGetCommodities(student);
        return res;
    }

    public ArrayList<Commodity> DilGetCommodities(DileverMan dileverMan) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Commodity> res = mapper.DilGetCommodities(dileverMan);
        return res;
    }


    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }
}