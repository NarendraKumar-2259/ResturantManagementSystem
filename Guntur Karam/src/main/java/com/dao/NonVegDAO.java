package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.NonVeg;


public class NonVegDAO {
	public List<NonVeg> viewAll() throws ClassNotFoundException, SQLException{
		Connection conn = ConnectionManager.getConnection();
		String query = "select* from non_veg";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet set = ps.executeQuery();
		List<NonVeg> non_veg_list = new ArrayList<>();
		while(set.next()) {
			NonVeg obj = new NonVeg();
			obj.setNon_veg_id(set.getInt(1));
			obj.setName(set.getString(2));
			obj.setPrice(set.getString(3));
			non_veg_list.add(obj);
			
		}
		return non_veg_list;
		
	}
}
