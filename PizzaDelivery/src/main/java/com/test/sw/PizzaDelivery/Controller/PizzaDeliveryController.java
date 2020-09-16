package com.test.sw.PizzaDelivery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sw.PizzaDeliver.Service.OrderStatusService;

@RestController
@RequestMapping(value="/pizzaDeliver")
public class PizzaDeliveryController {

	@Autowired
	private OrderStatusService orderStatusServiceImpl;
	
	@GetMapping(value="/getStatus/{orderId}")
	public String returnStatus(@PathVariable Integer orderId){
		return "Status for Order : "+orderId+" is "+orderStatusServiceImpl.getOrderStatus(orderId);
	}
}
