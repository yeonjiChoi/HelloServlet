package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// read form data 
		// index.html의 username과 password 데이터 읽어들이기
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Process : access to database, perform business logic
		
		// build HTML code
		PrintWriter out = response.getWriter();
		// ctrl + Shift + o : Library import, ctrl + space : 자동완성
		String htmlResponse = "<html>";
		htmlResponse += "<h2> Your username is " + username + "<br/>";
		htmlResponse += "<h2> Your password is " + password + "<h2/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
		// 배포하는 방법 : export -> Tomcat 9.0/webapps 파일에 저장 -> monitor tomcat 실행
	}

}
