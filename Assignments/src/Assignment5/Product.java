package Assignment5;

public class Product {
	
	 private String name;
	 private double price;
	 private String category;
	 private String date;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public Product(String name, double price, String category, String date) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", date=" + date + "]";
	}
	 
	 
	 
}
