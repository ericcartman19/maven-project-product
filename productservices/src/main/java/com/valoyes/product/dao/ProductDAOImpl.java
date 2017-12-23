package com.valoyes.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.valoyes.product.dto.Product;

public class ProductDAOImpl implements ProductDAO{

	Map<Integer, Product> products = new HashMap<>();
	
	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO
		// No lo vamos a implementar ahora ya que no es un requirement 
		// de este snapshot de la aplicacion
		
	}

	@Override
	public void delete(int id) {
		// TODO
		// No lo vamos a implementar ahora ya que no es un requirement 
		// de este snapshot de la aplicacion
		
	}

}
