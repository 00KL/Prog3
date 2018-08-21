
public class Client {
	private String name;
	private String cpf;
	private java.util.HashSet<Account> accounts = new java.util.HashSet<Account>();
	
	
	public Client(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public void newAccount(Account account) {
		accounts.add(account);
	}
	
	public void allAccounts() {
		for(Account x : accounts) {
			System.out.println(x.getAccountNumber());
		}
	}
	
	public float accountBalance(int accountNumber) {
		for(Account x : accounts) {
			if(x.getAccountNumber() == accountNumber)
				return x.getBalance();
		}
		
		return 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	
}
