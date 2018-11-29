package edu.ifg.lessons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AccountJPAInsertTest {

	
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("postgres-accounts").createEntityManager();
		Account a = new Account("Fabricio", "34872-2", "Itau", 340.89);
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
	}
}
