package com.cos.blog.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
// http://localhost:8080/blog/test

public class ApiServerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ApiServerTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String food = request.getParameter("food");
		String method = request.getParameter("method");
		
		// food와 method 를 DB에 INSERT하고 끝
		
		int result = 1; //정상
		PrintWriter out = response.getWriter();
		
		if(result == 1) {
			out.println("{\"food\":"+ food +",\"method\":"+ method +"}");
		}else {
			out.println("{\"error\":\"100\"}");
		}
	}
}
