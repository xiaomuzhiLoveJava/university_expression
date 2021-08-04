package controller;

import com.mysql.cj.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.*;
import servce.service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@Controller
public class Servlet {

    @RequestMapping("/login")//登录页面
    public String login(HttpServletRequest req, HttpServletResponse resp,Model model) throws IOException {
        String usr = req.getParameter("username");
        String pwd = req.getParameter("password");

        System.out.println(usr+" <==============>  "+pwd);

        if(usr==null||pwd==null)
           return "index";
        else {
            HttpSession session = req.getSession();
            session.setAttribute("username",usr);
            session.setAttribute("property",service.login(usr,pwd));

            switch (service.login(usr,pwd)){
                case 1: return "admin";
                case 3: return "deliverman";
                case 2: return "student";
                default: return "login";
            }
        }
    }
    @RequestMapping("/dispose")//收件处理
    public String queryAll(HttpServletRequest req, HttpServletResponse resp, Model model){
        HttpSession session = req.getSession();
        ArrayList<Commodity> list = new ArrayList<>();
        if(1 == (Integer) session.getAttribute("property"))  list = service.queryAll();
        else list = service.DilGetCommodities((String) session.getAttribute("username"));
        model.addAttribute("list",list);
        return "dispose";
    }

    @RequestMapping("/delivery")//货物分仓
    public String dispose(HttpServletRequest req, HttpServletResponse resp, Model model){
        HttpSession session = req.getSession();
        ArrayList<Commodity> list = new ArrayList<>();
        if(1 == (Integer) session.getAttribute("property"))  list = service.queryAll();
        else list = service.DilGetCommodities((String) session.getAttribute("username"));
        model.addAttribute("list",list);

        return "delivery";
    }


    @RequestMapping("/update")//信息修改
    public String update(HttpServletRequest req, HttpServletResponse resp,Model model) throws IOException {
        HttpSession session = req.getSession();
        String PhoneNumb = (String) session.getAttribute("username");
        System.out.println("更新信息："+PhoneNumb);
        System.out.println("Servlet：property===》"+session.getAttribute("property"));
        if(1 == (Integer) session.getAttribute("property")){
            Administrator user = (Administrator) service.getUser(PhoneNumb);
            resp.addHeader("usr",user.getName());
        }
        else {
            DileverMan user = (DileverMan) service.getUser(PhoneNumb);
            resp.addHeader("usr",user.getName());
        }

        return "update";
    }

    @RequestMapping("/changinf")//信息修改业务调用
    public String changeInformation(HttpServletRequest req, HttpServletResponse resp,Model model) throws IOException {
        String name = (String) req.getParameter("name");
        String pwd = (String) req.getParameter("pwd");
        String place = (String) req.getParameter("RoomNumb");

        System.out.println("name:"+name+"  pwd:"+pwd+"   palce:"+place);
        HttpSession session = req.getSession();
        String PhoneNumb = (String) session.getAttribute("username");
        boolean bool = false;
        if(1 == (Integer) session.getAttribute("property")){
            Administrator user = (Administrator) service.getUser(PhoneNumb);
            user.setName(name);
            user.setPwd(pwd);
            bool = service.ChangeInformation(user);
        }
        else if(3 == (Integer) session.getAttribute("property")){
            DileverMan user = (DileverMan) service.getUser(PhoneNumb);
            user.setName(name);
            user.setPwd(pwd);
            user.setPalce(place);
            System.out.println("66666666666666666666666\n"+user.toString()+"\n6666666666666666666666666");
            bool = service.ChangeInformation(user);
        }

        if(bool) {
            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('修改成功！');");
            out.println("history.back();");
            out.println("</script>");
        }else{
            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('修改失败！');");
            out.println("history.back();");
            out.println("</script>");
        }
        return "update";
    }
    @RequestMapping("/getin")//货物上架
    public String getin(HttpServletRequest req, HttpServletResponse resp){
        String ID = req.getParameter("deliveryID");
        service.setTakingCode(ID);
        return "dispose";
    }

    @RequestMapping("/takein")
    public String takein(HttpServletRequest req, HttpServletResponse resp){
        String id = req.getParameter("deliveryID");
        service.takein(id);
        return "takein";
    }

}
