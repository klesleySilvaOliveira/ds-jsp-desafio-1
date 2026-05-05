package com.devsuperior.desafio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		
		Double orderTotal = order.getBasic() * ((100.0 - order.getDiscount())/100.0);
		
		if (orderTotal < 100.0) {
			return 20.0;
		}
		else if (orderTotal < 200.0) {
			return 12.0;
		}
		else return 0.0;
	}
}
