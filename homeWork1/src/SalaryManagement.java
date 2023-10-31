import java.util.Random;
	
public class SalaryManagement {
	private TransactionManagement transactionManagement;
	private ShopAssistant[] shopAssistants;
	private Product[] products;
		
	public SalaryManagement(ShopAssistant[] shopAssistantSalary, Product[] products,TransactionManagement transactionManagement) {
		this.shopAssistants = shopAssistantSalary;
		this.products = products;
		this.transactionManagement = transactionManagement;
	}
	//Determines seniority, calculates and assigns salaries.		
	private void setSalary(ShopAssistant shopAssistant) {
		    	
		int Seniority = 0;
		double Salary = 0;
		Random dice = new Random();
		Seniority = dice.nextInt(15);
	
		if (Seniority < 1) {
			Salary = 1500*4;
		}
		else if( 1 <= Seniority && Seniority < 3) {
			Salary = 2000*4;
		}
		else if (3 <= Seniority  && Seniority < 5) {
			Salary =2500*4;
		}
		else if (5 <= Seniority ) {
			Salary=3000*4;
		}
		shopAssistant.setBasisSalary(Salary);
		shopAssistant.setSeniority(Seniority);
		Transaction[] transactions = transactionManagement.getTransactions(products);
		double comission = transactionManagement.calculateComission(transactions);
		transactionManagement.setTransactions(shopAssistant.getID(), transactions);
			    
		Salary += comission;
			    
		shopAssistant.setTotalSalary(Salary);
		shopAssistant.setComission(comission);	
			   
	}
		      
	public ShopAssistant[] getShopAssistants() {
		return shopAssistants;
	}
	//Iterates through the shop assistants array and assigns salaries
	public void setSalaries() {
		for (int i =0; i < shopAssistants.length; i++) {
		    setSalary(shopAssistants[i]);
		}
	}
}
