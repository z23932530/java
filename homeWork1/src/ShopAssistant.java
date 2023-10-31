public class ShopAssistant {
	private int ID;
	private String Name;
	private String Surname;
	private String PhoneNumber;
	private double basisSalary;
	private double comission;
	private double totalSalary;
	private Transaction[] transactions;
	private int seniority;
	

	public ShopAssistant(int iD, String name, String surname, String phoneNumber) {
		ID = iD;
		Name = name;
		Surname = surname;
		PhoneNumber = phoneNumber;
		transactions = new Transaction[15];
	}
	
	public double getBasisSalary() {
		return basisSalary;
	}
	public void setBasisSalary(double basisSalary) {
		this.basisSalary = basisSalary;
	}
	public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Transaction[] getTransactions() {
		return transactions;
	}
	public void setTransactions(Transaction[] transactions) {
		this.transactions = transactions;
	}
	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	}

    

