package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Orders;

public class OrdersDAO {
	Connection connection = null;

	public boolean saveOrders(Orders order) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		connection = ConnectionManager.getConnection();
		String query = "insert into orders(customer_name, item_id) values(?, ?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, order.getCustomer_name());
		ps.setInt(2, order.getItem_id());
		
		int count = ps.executeUpdate();
		 if(count!=0) {
			 return true;
		 }
		return false;
	}
	public void commit() throws SQLException {
		connection.commit();
		connection.close();
	}
	
	public void rollback() throws SQLException {
		connection.rollback();
		connection.close();
	}
	
}
