package lab1;
public class testador {
	public static void main(String args[]) {
		//new client
		Client ana = new Client("Ana", "100");
		//System.out.printf("%s %s\n", ana.getName(), ana.getCpf());
		
		//new account
		Account anaAccount = new Account(ana, 30, 3);
		Account anaAccount2 = new Account(ana, 40, 4);
		Account anaAccount3 = new Account(ana, 50, 5);
		
		//print account content
//		System.out.printf("%d %s %s\n", anaAccount.getAccountNumber(), anaAccount.getClient().getName(), anaAccount.getClient().getCpf() );
//		System.out.printf("%d %s %s\n", anaAccount2.getAccountNumber(), anaAccount2.getClient().getName(), anaAccount2.getClient().getCpf() );
//		System.out.printf("%d %s %s\n", anaAccount3.getAccountNumber(), anaAccount3.getClient().getName(), anaAccount3.getClient().getCpf() );
		
		System.out.printf("%.2f\n", ana.accountBalance(3));
		System.out.printf("%.2f\n", ana.accountBalance(4));
		System.out.printf("%.2f\n", ana.accountBalance(5));
		
	}
}