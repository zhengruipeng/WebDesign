package main;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/main/CheckStudentInfo")
public class CheckStudentInfo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CheckStudentInfo(){
        super();
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");

        //连接
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath())
                .append("<h1>1234</h1>");
        PrintWriter out = response.getWriter();
        out.println("4441");
    }

}
