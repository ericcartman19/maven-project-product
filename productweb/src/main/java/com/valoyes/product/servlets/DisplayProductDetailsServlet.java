package com.valoyes.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.valoyes.product.bo.ProductBO;
import com.valoyes.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// contendra en runtime todos nuestros beans
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		// recuperamos product metier
		ProductBO bo = (ProductBO) context.getBean("productbo");
		
		// llamamos a su metodo create
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product details: ");
		out.print("Product ID: " + product.getId());
		out.print("Product Name: " + product.getName());
		out.print("Product Description: " + product.getDescription());
		out.print("Product price: " + product.getPrice());
	}

}
