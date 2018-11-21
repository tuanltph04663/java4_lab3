package lap03.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lap03.Model.CheckLogin;


/**
 * Servlet implementation class ControllerLogin
 */
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Views-PhanI/Login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			String action = request.getParameter("action");
			if (action.equals("Login")) {
				String username = request.getParameter("username");
				String password = request.getParameter("password");

				if (CheckLogin.checkLogin(username, password)) {
					request.setAttribute("user", username);
					RequestDispatcher dispatcher = request.getRequestDispatcher("/Views-PhanI/Welcome.jsp");
					dispatcher.forward(request, response);
				} else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/Views-PhanI/Fail.jsp");
					dispatcher.forward(request, response);
				}
			} else if (action.equals("tryagain")) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Views-PhanI/Login.jsp");
				dispatcher.forward(request, response);
			}
		}
	}

}
