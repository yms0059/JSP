package com.javalec.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleEx
 */
@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleEx() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException { //딱 한번
    	// TODO Auto-generated method stub
    	System.out.println("init");
    }

	@Override
	public void destroy() {  //서버 재가동되거나 마지막으로 해제할때
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}
	
	
	
	@PostConstruct  //선처리작업 init하기전에 작업
	private void initPostConstruct() {  //메소드명은 임의로 만들어라
		// TODO Auto-generated method stub
		System.out.println("initPostConstruct");
	}
	
	@PreDestroy    //후처리 자원해제된 후에 작업
	private void destoryPreDestory() {
		// TODO Auto-generated method stub
		System.out.println("destoryPreDestory");
	}

}
