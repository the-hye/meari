package com.ktds.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginSession extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html;charser=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String member_id=request.getParameter("member_id");
		String member_pw=request.getParameter("member_pw");
	
		if(session.isNew()) {
			if(member_id != null) {
				session.setAttribute("member_id", member_id);
				out.println("<a href='login'로그인상태확인</a>");
			}else {
				out.println("<a href='login.html'>다시로그인하세요</a>");
			}
		}else {
			member_id = (String)session.getAttribute("member_id");
			if(member_id != null && member_id.length()!=0) {
				out.print("안녕하세요" + member_id + "님");
			}else {
				out.println("<a href='login.html'>다시 로그인하세요</a>");
				session.invalidate();
			}
		}
	
	}
}
