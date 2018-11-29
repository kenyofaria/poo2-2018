package edu.ifg.lessons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentInsertTest {

	
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres-accounts");
		EntityManager em = factory.createEntityManager();
		
		
		Student s1 = new Student("Lucas Urquiza", "male", "Nova Veneza");
		Student s2 = new Student("Carlos Eduardo", "male", "Inhumas");
		Student s3 = new Student("Kaique", "male", "Caturaí");
		Student s4 = new Student("Bruno", "male", "Inhumas");
		Student s5 = new Student("Elias", "male", "Inhumas");
		
		
		em.getTransaction().begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(s5);
		em.getTransaction().commit();
		
		
	}
}
