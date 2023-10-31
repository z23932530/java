import java.util.Random;

public class TransactionManagement {
	
	private Transaction[][] transactionObjects = new Transaction[100][15];
	
	public TransactionManagement() {
		
	}
	
	public Transaction[][] getTransactions(){
		return transactionObjects;
	}
	
	public void setTransactions(int id, Transaction[] transactions) {
		transactionObjects[id] = transactions;		
	}
	//Generates 15 transactions with random quantities of up to 3 products, calculates total prices, and applies transaction fees based on the total price.
	public Transaction[] getTransactions(Product[] products) {
		Transaction[] transactions = new Transaction[15];
		int i = 0;
    
		for (int transactionCount = 1; transactionCount <= 15; transactionCount++) {
	        this.shuffleArray(products);
	
	        int counter = 0;
	        float total = 0;
	        Transaction currentTransaction = new Transaction();
	        Product[] currentProducts = new Product[3];
	        
	        for (Product p : products) {
	            if (counter == 3) {
	                break;
	            }
	            currentProducts[counter] = p;
	            Random dice = new Random();
	            int number = 1 + dice.nextInt(10);
	            float a = number * p.getPrice();
	            total += a;
	            counter++;
	        }
	        currentTransaction.setArray(currentProducts); 
	        currentTransaction.setTotalPrice(total);
	        
	        double transactionFee = 0.0;
	        if (total <= 500) {
	        	transactionFee = (0.01*total);
	        } else if (total >= 500 && total <= 799) {
	        	transactionFee = (0.03 * total);
	        } else if (total >= 800 && total <= 999) {
	        	transactionFee =  (0.05 * total);
	        } else if (total >= 1000) {
	        	transactionFee =  (0.09 * total);
	        }
	        currentTransaction.setTransactionFee(transactionFee);
	        transactions[i] = currentTransaction;
	        i++;
	        
	        total += transactionFee;
	    }
    
		return transactions;
    
	}
    //Calculates the total commission based on the total prices of transactions with an additional commission percentage based on the total price.
	public double calculateComission(Transaction[] transactions){
		double totalPrice = 0;
		for (Transaction t : transactions) {
			totalPrice += t.getTotalPrice() + t.getTransactionFee();
		}
	    if (totalPrice < 7500) {
	    	totalPrice += totalPrice * 0.01;
	    } else {
	    	totalPrice += totalPrice * 0.03;
	    }
		 
	    return totalPrice;

	}		
					
	//Shuffles the order of elements in an array using the Fisher-Yates algorithm.
	private void shuffleArray(Product[] array) {
	    int n = array.length;
	    Random rand = new Random();
	
	    for (int i = n - 1; i > 0; i--) {
	        int j = rand.nextInt(i + 1);
	
	        Product temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	}   

}
