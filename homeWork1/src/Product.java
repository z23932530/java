public class Product {
	private Integer ID;
	private String name;
	private Float price;
	
	public Product(Integer ID, String name, Float price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
