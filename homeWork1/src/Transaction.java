public class Transaction {
	private int ID;
	private Product[] productsArray;
	private double TotalPrice;
	private double TransactionFee;
	private static int counter = 0;
	
	public Transaction() {
		//To give an unique ID to each transaction object.
		this.ID = counter;
		counter++;
		productsArray = new Product[3];
	}
    	
	@Override
	public String toString() {
		return "Transaction [ID=" + ID + ", TotalPrice="
				+ TotalPrice + ", TransactionFee=" + TransactionFee + "]";
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	public Product[] getArray() {
		return productsArray;
	}

	public void setArray(Product[] array) {
		productsArray = array;
	}

	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	public double getTransactionFee() {
		return TransactionFee;
	}
	public void setTransactionFee(double transactionFee) {
		TransactionFee = transactionFee;
	}

}
