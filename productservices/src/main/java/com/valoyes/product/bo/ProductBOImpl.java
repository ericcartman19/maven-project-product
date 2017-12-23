package com.valoyes.product.bo;

import com.valoyes.product.dao.ProductDAO;
import com.valoyes.product.dto.Product;

/**
 * Implementacion del metier, que en una aplicacion real
 * tendria mas complejidad, con la logica de negocio
 * 
 * @author benito
 *
 */
public class ProductBOImpl implements ProductBO {

	// DAO object
	private ProductDAO dao;
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
