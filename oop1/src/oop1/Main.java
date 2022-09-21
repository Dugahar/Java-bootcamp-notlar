package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		//Tip //değişken
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		//html
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setFirstName("Utku");
		individualCustomer.setLastName("Özlü");
	
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setCompanyName("hebele");
		corporateCustomer.setTaxNumber("65665190");
		corporateCustomer.setCustomerNumber("15267");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
	}
	
}
