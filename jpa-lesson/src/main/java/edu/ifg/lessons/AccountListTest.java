package edu.ifg.lessons;

import java.util.List;

public class AccountListTest {

	
	private static List<Account> pagedList;

	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory();
		
		AccountDAO dao = new AccountDAO(factory.getConnectionPostgres());
		pagedList = dao.pagedList(0, 10);
		for (Account a : pagedList) {
			System.out.println(a.getHolder() + "  --  " +  a.getBank() + "  --  " + a.getFunds());
		}
		
	}
}
