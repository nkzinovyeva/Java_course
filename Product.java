

public class Product {
	private int itemId;
	private String productName;
	private double price;

	public Product(int itemId, String productName, double price) {
		this.itemId = itemId;
		this.productName = productName;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
