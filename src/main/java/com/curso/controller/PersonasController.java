package com.curso.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonasController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String personas[] = { "Wilber", "Kennyl", "Pastora" };
		request.setAttribute("personas", personas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/persona.jsp");
		dispatcher.forward(request, response);
	}

}
