package com.devsuperior.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		Double orderTotal = order.getBasic() * ((100.0 - order.getDiscount())/100.0);
		
		return orderTotal + shippingService.shipment(order);
	}
}
