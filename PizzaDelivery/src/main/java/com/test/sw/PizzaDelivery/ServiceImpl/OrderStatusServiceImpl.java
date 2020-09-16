package com.test.sw.PizzaDelivery.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sw.PizzaDeliver.Service.OrderStatusService;
import com.test.sw.PizzaDelivery.Respository.OrderStatusRepository;

@Service
public class OrderStatusServiceImpl implements OrderStatusService{

	@Autowired
	private OrderStatusRepository orderStatusRepository;
	public String getOrderStatus(Integer orderId) {
		return orderStatusRepository.selectOrderStatusByID(orderId);
	}

}
