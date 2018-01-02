package com.javalec.ex;

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
@WebServlet("/PostMethod")   //맵핑하는 방법
public class PostMethod extends HttpServlet { 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostMethod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet");            //
		
//		response.setContentType("text/html");         //응답을 처리해주는데 html파일형식으로 응답해준다고.  (charset=euc-kr)//한국어 출력
//		PrintWriter writer = response.getWriter();    //웹브라우저에 출력하기 위한 스트림
//		writer.print("<html>");                       //html
//		writer.print("<head>");
//		writer.print("</head>");
//		writer.print("<body>");
//		writer.print("<h1>HelloWorld~~~</h1>");
//		writer.print("</body>");
//		writer.print("</html>");
//		
//		writer.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost");      
		response.setContentType("text/html; charset=euc-kr");         //응답을 처리해주는데 html파일형식으로 응답해준다고.  (charset=euc-kr)//한국어 출력
		PrintWriter writer = response.getWriter();    //웹브라우저에 출력하기 위한 스트림
		writer.print("<html>");                       //html
		writer.print("<head>");
		writer.print("</head>");
		writer.print("<body>");
		writer.print("<h1>POST방식 입니다. 따라서 getPost 메소드 호출 되었습니다.</h1>");
		writer.print("</body>");
		writer.print("</html>");
		
		writer.close();
	}

}
