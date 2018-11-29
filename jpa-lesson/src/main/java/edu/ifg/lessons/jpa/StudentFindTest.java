package edu.ifg.lessons.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentFindTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("postgres-accounts");
		EntityManager em = factory.createEntityManager();
		
//		Student s = em.find(Student.class, 3L);
		
		Query query = em.createQuery("from Student s where s.gender = " + "'male'");
		List<Student> resultList = query.getResultList();
		for (Student s : resultList) {
			System.out.println(s.getName() + "    " + s.getAddress());
		}
		
		
		
		
	}
	
	
}
