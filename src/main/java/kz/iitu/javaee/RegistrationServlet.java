package kz.iitu.javaee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/register")
public class RegistrationServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");

        response.setStatus(404);
        PrintWriter out = response.getWriter();
        out.println("<h1>Servlet HelloServlet</h1>");
        out.close();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/main.jsp");
        dispatcher.forward(request, response);

//        if(fullName.isEmpty() || age.isEmpty() || email.isEmpty() ||
//                password.isEmpty() || phone.isEmpty() )
//        {
//            RequestDispatcher req = request.getRequestDispatcher("register.jsp");
//            req.include(request, response);
//        }
//        else
//        {
//            RequestDispatcher req = request.getRequestDispatcher("succesreg.jsp");
//            req.forward(request, response);
//        }
    }

}
