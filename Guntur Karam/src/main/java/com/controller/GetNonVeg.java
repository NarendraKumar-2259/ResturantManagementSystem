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

import com.dao.NonVegDAO;
import com.dao.VegDAO;
import com.model.NonVeg;
import com.model.Veg;


@WebServlet("/GetNonVeg")
public class GetNonVeg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		NonVegDAO dao = new NonVegDAO();
		List<NonVeg> vegitems;
		try {
			vegitems = dao.viewAll();
			request.setAttribute("non_veg", vegitems);
			RequestDispatcher rd=request.getRequestDispatcher("viewnonveg.jsp");  
	        rd.forward(request, response);  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
