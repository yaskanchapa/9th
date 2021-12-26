package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhodst:8080/blog/board
@WebServlet("/reply")
public class ReplyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReplyController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doProcess(request,response); //전부 doProcess를 타게 만들기 위해서
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doProcess(request,response);
	
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd"); //cmd값을 받아오고 cmd값에따라 처리를 나눌예정 (프론트컨트롤러)
		
		//http://localhodst:8080/blog/reply?cmd=loginForm
		if(cmd.equals("loginForm")) {
			//서비스 호출
		}else if(cmd.equals("login")) {
			//서비스 호출
		}
	}
}
