package lab1;
public class Account {
	private int accountNumber;
	private float balance;
	private Client client;
	
	java.util.Random rand = new java.util.Random();
	
	
	public Account(Client client) {
		accountNumber = rand.nextInt(8999) + 1000;
		this.client = client;
		this.balance = 0;
		this.client.newAccount(this);
		
	}
	
	public Account(Client client, float balance, int accountNumber) {
		this.accountNumber = accountNumber;
		this.client = client;
		this.balance = balance;
		this.client.newAccount(this);
		
	}
	
	public Account(String name, String cpf) {
		accountNumber = rand.nextInt(8999) + 1000;
		this.client = new Client(name, cpf);
		this.balance = 0;
		this.client.newAccount(this);
		
	}
	
	public void deposit(float balance) {
		this.balance = balance;
	}
	
	public float getBalance() {
		return balance;
	}
	public Client getClient() {
		return client;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	
}