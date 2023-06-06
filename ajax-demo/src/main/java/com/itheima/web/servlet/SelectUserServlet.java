package com.itheima.web.servlet; /**
 * @author Mendy
 * @create 2023-06-06 15:31
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectUserServlet")
public class SelectUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1. accept username
        request.getParameter("username");

        //2. call service to check the user object

        // simulate a result at here for exercise
        boolean flag = true;

        //3. response the flag
        response.getWriter().write(""+flag);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
