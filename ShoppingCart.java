

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> itemList;

	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
	}

	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {
		for (int i = 1; i < itemList.size(); i++) {
			if (product.equals(itemList.get(i).getProduct())) {
				itemList.remove(itemList.get(i));
			}
		}
	}
	  public double getTotalPrice() {
		  double total = 0;
			for (Item itemObject : itemList) {
				total += itemObject.getSubtotal();
			}
			return total;
	  }
	  
	  public String toString() {
		  DecimalFormat twoDecimals = new DecimalFormat("0.00");
		  String output = "";
		  
		  if (getTotalPrice() == 0) {
			  output = "There are no items in the shopping cart.\n";
		  } else {
			  output = "=== Shopping cart ===\n";
			  for (int i = 0; i < itemList.size(); i++) {
				  output += itemList.get(i).getProduct().getItemId() + ": " + itemList.get(i).getProduct().getProductName() + ", quantity: "
						+ itemList.get(i).getQuantity() + ", unit price: " + twoDecimals.format(itemList.get(i).getProduct().getPrice()).replace('.', ',')
						+ ", subtotal: " + twoDecimals.format(itemList.get(i).getSubtotal()).replace('.', ',') + "\n";
			  }
			   output += "TOTAL PRICE: " + twoDecimals.format(getTotalPrice()).replace('.', ',') + " euros\n";
		  }
		  return output;
	  }
}