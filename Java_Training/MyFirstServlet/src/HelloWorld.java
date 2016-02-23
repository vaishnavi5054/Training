import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String greeting = "hello World!!!!!!";
		response.setContentType("text/html");
		String user = request.getParameter("user");
		String password = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.print("hello .. "+request.getParameter("user"));
		out.print("Welcome to java Servlet");
		if(user.equals("Vaishu") && password.equals("password")){
			out.println("<h1>Success</h1>");
		}
		else{
			out.println("<h1> Failure </h1>");
		}
		out.print("</body>");
		out.print("</html>");
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
