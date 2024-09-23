package com.symplore.ussessions.warehousemanagement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.symplore.ussessions.warehousemanagement.controller.ProductServiceController;
import com.symplore.ussessions.warehousemanagement.entity.ProductDetails;

public class UI {
	private static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		addProduct();

	}

	private static void addProduct() {

		System.out.println("enter product Name");
		String pname = sc.next();
		System.out.println("enter manufacturing date in format d-MM-YYYY");
		String manDate = sc.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate mdt = LocalDate.parse(manDate, dtf);

		System.out.println("enter expiry date in format DD-MM-YYYY");
		String expDate = sc.next();
		LocalDate edt = LocalDate.parse(expDate, dtf);
		System.out.println("enter category");
		String category = sc.next();

		ProductDetails product = new ProductDetails();
		product.setCategory(category);
		product.setExpDate(edt);
		product.setManDate(mdt);
		product.setProdName(pname);
		
		ProductServiceController controller= new ProductServiceController();
		controller.addProduct(product);

	}

}
