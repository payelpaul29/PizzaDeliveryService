package com.test.sw.PizzaDelivery.Respository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderStatusRepository {

	@Autowired
	private JdbcTemplate template;
	
	private String sql="SELECT STATUS FROM ORDER_STATUS WHERE ORDER_ID = ?;"; 
	
	public String selectOrderStatusByID(Integer orderId){
		
		
		Map<String,Object> result = (Map<String,Object>)template.queryForMap(sql,new Object [] {orderId});
		
		return result.get("STATUS").toString();
		
	}
}
