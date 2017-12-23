package com.valoyes.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.valoyes.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void casPassant_ShouldCreateAProduct() {

		// creamos un dao
		ProductDAO dao = new ProductDAOImpl();
		// un objeto
		Product product = new Product();
		product.setId(1);
		product.setName("Google Pixel");
		product.setDescription("Going strong");
		product.setPrice(900);
		dao.create(product);
		
		// assert:
		assertNotNull(dao.read(1));
		assertEquals("Google Pixel", dao.read(1).getName());
		assertEquals("Going strong", dao.read(1).getDescription());
		assertEquals(900, dao.read(1).getPrice());
		assertNotSame("Whatever", dao.read(1).getName());
	}

}
