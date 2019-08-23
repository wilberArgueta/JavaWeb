package com.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Formulario() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter outPut = response.getWriter();
		response.setContentType("text/html");
		outPut.println("<html><head><title>respuesta</title></head>");
		outPut.println("<body>");
		outPut.println(
				"<h1> Hello " + request.getParameter("nombre") + " " + request.getParameter("apellido") + " </h1><br>");
		outPut.println(
				"<h3>Today is: <span style=\"background-color: red;color:white;\">" + LocalDate.now() + "</span></h3>");
		outPut.println(
				"<form action=\"persona\" method=\"post\"><input type=\"submit\" value=\"Personas\"/> " + "</form>");
		outPut.println("</body>");
		outPut.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
