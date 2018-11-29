package edu.ifg.lessons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HomensDePequenaFe {

	
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres-accounts");
		EntityManager em = factory.createEntityManager();
		
//		People p1 = new People("Joel", "M");
//		People p2 = new People("Joao", "M");
		
		
		
		
		
		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
		People p = em.find(People.class, 2L);
		System.out.println(p.getName() + "    " + p.getSexo());
		p.setName("Joel Monteiro");

		em.getTransaction().commit();
		
	}
}
