package edu.ifg.lessons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountListTest {

	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres-accounts");
		EntityManager em = emf.createEntityManager();
		Account a = em.find(Account.class, 2L);
		System.out.println(a.getHolder());
		
	}
}
