package edu.ifg.lessons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JustingTimeTest {

	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres-accounts");
		EntityManager em = emf.createEntityManager();
			
		Account account = new Account("Joao", "10223-45", "New York Bank", 500000.00);
		
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		
	}
}
