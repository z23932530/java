
public class SalesManagementApp {

	public static void main(String[] args) {
		//shop assistants, products, and a transaction manager initialized by reading CSV files.
    	Product[] products = FileIO.ReadProducts();
    	ShopAssistant[] shopAssistants = FileIO.ReadShopAssistants();
    	TransactionManagement transactionManager = new TransactionManagement();
    	SalaryManagement salaryManager = new SalaryManagement(shopAssistants, products, transactionManager);
    	salaryManager.setSalaries();
    	
    	
    	Query queries = new Query(transactionManager,salaryManager);
    	queries.highestTotalPriceTransaction();
    	queries.mostExpensiveProductInTheLowestPriceTransaction();
    	queries.lowestTransactionFee();
    	queries.highestSalaryShopAssistant();
		System.out.println("The total revenue that is earned from 1500 transactions: " + queries.totalRevenue() );
    	queries.totalProfit();
    }


}