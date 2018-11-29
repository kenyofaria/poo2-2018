package edu.ifg.lessons;

public class AccountInsertTest {

	
	public static void main(String[] args) {
		
		ConnectionFactory factory = new ConnectionFactory();
		AccountDAO dao = new AccountDAO(factory.getConnectionPostgres());
		
		
		Account account1 = new Account("Rogério", "34566-0", "credit suisse", 100.00);
		dao.save(account1);
		
		Account account2 = new Account("Paulo", "87554-1", "citi bank", 59800.00);
		dao.save(account2);
		
		Account account3 = new Account("Enéias", "45673-2", "boston bank", 35000.00);
		dao.save(account3);
		
		Account account4 = new Account("Daniel", "12309-3", "bwin", 57000.00);
		dao.save(account4);
		
		Account account5 = new Account("Marcos", "09834-4", "bank of china", 2000.00);
		dao.save(account5);
		
		Account account6 = new Account("Roney", "56701-5", "jpmorgan", 1789.90);
		dao.save(account6);
		
		Account account7 = new Account("Kenyo", "26510-6", "deutsche bank", 5000.87);
		dao.save(account7);
		
		Account account8 = new Account("Antônio", "01923-7", "royal bank", 100000.09);
		dao.save(account8);
		
		Account account9 = new Account("Adriana", "01918-8", "ubs", 234.00);
		dao.save(account9);
		
		Account account10 = new Account("Helena", "12650-9", "sumitomo", 67543.78);
		dao.save(account10);
	}
}
