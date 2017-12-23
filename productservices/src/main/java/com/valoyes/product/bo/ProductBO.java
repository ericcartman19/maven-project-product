package com.valoyes.product.bo;

import com.valoyes.product.dto.Product;

/**
 * Los metodos que se definen en esta interfaz
 * describen la logica de negocio, y los mismos van
 * a llamar a la capa DAO
 * 
 * @author benito
 *
 */
public interface ProductBO {

	public void create(Product product);
	
	public Product findProduct(int id);
}
