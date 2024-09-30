package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.VegDAO;
import com.model.Veg;


@WebServlet("/GetVeg")
public class GetVeg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		VegDAO dao = new VegDAO();
		List<Veg> vegitems;
		try {
			vegitems = dao.vegviewAll();
			request.setAttribute("veg", vegitems);
			RequestDispatcher rd=request.getRequestDispatcher("viewveg.jsp");  
	        rd.forward(request, response);  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
