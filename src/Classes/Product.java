package Classes;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
	@Size(min=1,max=30,message="The product name should be between 1 - 30 characters.")
	String name;
	@Size(min=1,max=30,message="This box cannot be empty.")
	String brand;
	@Size(min=1,max=30,message="This box cannot be empty.")
	String description;
	@Size(min=1,max=30,message="This box cannot be empty.")
	String price;
	@Pattern(regexp = "^[0-9]{4}-(((0[13578]|(10|12))-(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)-(0[1-9]|[1-2][0-9]|30)))$", message="Invalid date. Format: yyyy-mm-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	String date;
	
	public Product() {
		
	}
	
	public Product(@Size(message = "No puede estar vacio", min = 1, max = 30) String name, @NotEmpty String brand,
			@NotEmpty String description, @NotEmpty String price, @NotEmpty String date) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}	
}
