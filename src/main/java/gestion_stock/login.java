package gestion_stock;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/login")
public class login extends HttpFilter implements Filter {
    private boolean verify = false;

    private static final long serialVersionUID = 1L;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // Create an instance of admin for authentication
        admin adminUser = new admin();

        // Authenticate the user
        verify = adminUser.authenticate(login, password);

        if (!verify) {
            out.println("<HTML>");
            out.println("<HEAD><TITLE>Error</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<H1>Login or password invalid!!!</H1>");
            out.println("</BODY></HTML>");
            out.close();
        } else {
            out.println("<HTML>");
            out.println("<HEAD><TITLE>Welcome</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<H1>Welcome</H1>" + adminUser.getUsername());
            out.println("</BODY></HTML>");
            out.close();

            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        // Initialization code here, if needed
    }

    @Override
    public void destroy() {
        // Cleanup code here, if needed
    }
}


