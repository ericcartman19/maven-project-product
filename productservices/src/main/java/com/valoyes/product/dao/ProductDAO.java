package com.valoyes.product.dao;

import com.valoyes.product.dto.Product;

/**
 * 
 * Interface que define el comportamiento CRUD 
 * sobre el objeto Product
 * 
 * @author benito
 *
 */
public interface ProductDAO {

	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);
	
}
