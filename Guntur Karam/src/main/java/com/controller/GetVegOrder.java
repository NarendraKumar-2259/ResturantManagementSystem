package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.OrdersDAO;
import com.model.Orders;

@WebServlet("/GetVegOrder")
public class GetVegOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Orders order = new Orders();
		
		order.setCustomer_name(request.getParameter("cname"));
		int orders = Integer.parseInt(request.getParameter("veg_id"));
		order.setItem_id(orders);
		OrdersDAO dao = new OrdersDAO();
		try {
			boolean status = dao.saveOrders(order);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
