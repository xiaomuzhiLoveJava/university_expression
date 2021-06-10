package servlet;

import servce.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usr = req.getParameter("username");
        String pwd = req.getParameter("password");
        System.out.println(usr+"   "+pwd);
        if(usr==null||pwd==null)
            resp.sendRedirect("/JnuExpress/index.jsp");
        else {
            if(service.login(usr,pwd)){
                resp.sendRedirect("/JnuExpress/login.jsp");
            }
            else {
                resp.sendRedirect("/JnuExpress/error.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
