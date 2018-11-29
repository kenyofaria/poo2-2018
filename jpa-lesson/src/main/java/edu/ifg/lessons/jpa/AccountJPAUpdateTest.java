package edu.ifg.lessons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AccountJPAUpdateTest {

	
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("postgres-accounts").createEntityManager();
		
		em.getTransaction().begin();
		
		Account existingAccount = em.find(Account.class, 11L);
		System.out.println("account holder: " +
							existingAccount.getHolder() + 
							"    --    current funds: " + 
							existingAccount.getFunds());
		System.out.println("updating funds ...");
		existingAccount.setFunds(10342.90);
			
		
		em.getTransaction().commit();
		
	}
}
