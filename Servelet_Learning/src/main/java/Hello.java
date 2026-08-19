import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first")
public class Hello implements Servlet {

    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
       this.servletConfig=servletConfig;
        System.out.println("Hello World");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello World servoice");
    }

    @Override
    public void destroy() {
        System.out.println("Hello World destroyed");
    }


    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }


    @Override
    public String getServletInfo() {
        return "shubham";
    }

}
