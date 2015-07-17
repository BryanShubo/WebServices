package com.bharath.ws.trainings.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bharath.ws.trainings.CreateOrdersRequest;
import com.bharath.ws.trainings.CreateOrdersResponse;
import com.bharath.ws.trainings.CustomerOrdersPortType;
import com.bharath.ws.trainings.GetOrdersRequest;
import com.bharath.ws.trainings.GetOrdersResponse;
import com.bharath.ws.trainings.Order;
import com.bharath.ws.trainings.Product;

public class CustomersOrdersWSImpl implements CustomerOrdersPortType {

	Map<BigInteger, List<Order>> customerOrders = new HashMap<>();
	int currentCustomerId;

	public CustomersOrdersWSImpl() {
		init();
	}

	public void init() {
		List<Order> orders = new ArrayList<Order>();
		Order order = new Order();
		order.setId(BigInteger.valueOf(1));
		Product product = new Product();
		product.setDescription("IPhone");
		product.setId("1");
		product.setQuantity(BigInteger.valueOf(3));

		order.getProduct().add(product);

		orders.add(order);
		customerOrders.put(BigInteger.valueOf(++currentCustomerId), orders);
	}

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) {

		GetOrdersResponse response = new GetOrdersResponse();
		List<Order> orders = response.getOrder();
		System.out.println(request.getCustomerId());
		List<Order> currentOrders = customerOrders.get(request.getCustomerId());

		for (Order order : currentOrders) {
			orders.add(order);
		}
		return response;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
		List<Order> list = new ArrayList<>();
		list.add(request.getOrder());
		BigInteger newCustomerId = BigInteger.valueOf(++currentCustomerId);

		customerOrders.put(newCustomerId, list);
		CreateOrdersResponse createOrdersResponse = new CreateOrdersResponse();
		createOrdersResponse.setResult(true);
		return createOrdersResponse;
	}
}
