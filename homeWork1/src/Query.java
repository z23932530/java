public class Query {
	private TransactionManagement transactionManager;
	private SalaryManagement salaryManager;
	
	public Query(TransactionManagement transactionManager, SalaryManagement salaryManager) {
		this.transactionManager = transactionManager;
		this.salaryManager = salaryManager;
		
	}
	// Finds the highest-total-price transaction
	public void highestTotalPriceTransaction() {
		Transaction[][] allTransactions = transactionManager.getTransactions();
		Transaction maxTransaction = allTransactions[0][0];
		for(int i = 0; i < allTransactions.length;i++ ) {
			for(int j = 0; j < allTransactions[i].length;j++) {
				if (allTransactions[i][j].getTotalPrice() >  maxTransaction.getTotalPrice()) {
					maxTransaction = allTransactions[i][j]; 
				}
			}
		}
		System.out.println("The highest-total-price transaction: " + maxTransaction.toString());
	}
	//Finds the most expensive product in the lowest-price transaction
	public void mostExpensiveProductInTheLowestPriceTransaction(){
		Transaction[][] allTransactions = transactionManager.getTransactions();
		Transaction minTransaction = allTransactions[0][0];
		for(int i = 0; i < allTransactions.length;i++ ) {
			for(int j = 0; j < allTransactions[i].length;j++) {
				if (allTransactions[i][j].getTotalPrice() <  minTransaction.getTotalPrice()) {
					minTransaction = allTransactions[i][j]; 
					
				}
			}
		}
	
		Product[] products = minTransaction.getArray();
		String mostExpensiveProduct = products[0].getName();
	
		for (int a = 0; a < products.length; a++) {
		    if (products[a].getPrice() > products[0].getPrice()) {
		        mostExpensiveProduct = products[a].getName();
		    }
		}
	
		    System.out.println("The most expensive product in the lowest-price transaction: " + mostExpensiveProduct);
	}
	//Finds the lowest transaction fee
	public void lowestTransactionFee() {
		Transaction[][] allTransactions = transactionManager.getTransactions();
		Transaction LowestFee = allTransactions[0][0];
		for(int i = 0; i < allTransactions.length;i++ ) {
			for(int j = 0; j < allTransactions[i].length;j++) {
				if (allTransactions[i][j].getTransactionFee() < LowestFee.getTransactionFee()) {
					LowestFee = allTransactions[i][j];
				}
		}
	}
		System.out.println("LowestFee: " + LowestFee.getTransactionFee());
  }
	//Finds the highest-salary shop assistant
	public void highestSalaryShopAssistant() {
		ShopAssistant[] allShopAssistants = salaryManager.getShopAssistants();
		ShopAssistant highestSalary = allShopAssistants[0];
		for (int i = 0; i < allShopAssistants.length; i++ ) {
			if (allShopAssistants[i].getTotalSalary() > highestSalary.getTotalSalary()) {
				highestSalary = allShopAssistants[i];

			}
		}
		
		System.out.println("ID: " + highestSalary.getID() + " name: " + highestSalary.getName() + " Surname: " + highestSalary.getSurname() + " Total Salary: " + highestSalary.getTotalSalary() + " Weekly Basis Salary: " + (highestSalary.getBasisSalary()/4)+ " Seniority: " + highestSalary.getSeniority() +" Comission: " + highestSalary.getComission());
}
	//Calculates the total revenue from 1500 transactions
	public double totalRevenue() {
		Transaction[][] allTransactions = transactionManager.getTransactions();
		double totalRevenue = 0.0;
		for (int i=0; i< allTransactions.length;i++) {
			for (int j=0; j < allTransactions[i].length; j++) {
				totalRevenue += allTransactions[i][j].getTotalPrice();
				totalRevenue += allTransactions[i][j].getTransactionFee();
				
			}
			
		}
		return totalRevenue;
	}
	//Calculates the total profit after paying shop assistant salaries
	public void totalProfit() {
		ShopAssistant[] allShopAssistants = salaryManager.getShopAssistants();
		double totalSalaries = 0.0;
		for (int i=0; i< allShopAssistants.length;i++) {	
				totalSalaries += allShopAssistants[i].getTotalSalary();
			}
		double totalRevenue = totalRevenue();


		System.out.println("Total Salaries: " + totalSalaries + " Total Revenue: " + totalRevenue + " Total profit: " + (totalRevenue-totalSalaries));

	
	}
	
	
}

	
	
	

