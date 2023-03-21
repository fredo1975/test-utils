package fr.bluechipit.jpa;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ExampleMain {
	
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf =
	            Persistence.createEntityManagerFactory("example-unit");
		try {
	          persistEntities(emf);
	          runNativeQueries(emf);
	          loadEntities(emf);
	      } finally {
	          emf.close();
	      }
	}

	public static void nativeQuery(EntityManager em, String s) {
        System.out.printf("'%s'%n", s);
        Query query = em.createNativeQuery(s);
        List list = query.getResultList();
        for (Object o : list) {
            if (o instanceof Object[]) {
                System.out.println(Arrays.toString((Object[]) o));
            } else {
                System.out.println(o);
            }
        }
    }
	private static void persistEntities(EntityManagerFactory emf) throws Exception {
	      System.out.println("-- Persisting entities --");
	      EntityManager em = emf.createEntityManager();

	      FullTimeEmployee e1 = new FullTimeEmployee();
	      e1.setName("Sara");
	      e1.setSalary(100000);
	      System.out.println(e1);

	      PartTimeEmployee e2 = new PartTimeEmployee();
	      e2.setName("Robert");
	      e2.setHourlyRate(60);
	      System.out.println(e2);

	      em.getTransaction().begin();
	      em.persist(e1);
	      em.persist(e2);
	      em.getTransaction().commit();
	      em.close();
	  }

	  private static void runNativeQueries(EntityManagerFactory emf) {
	      System.out.println("-- Native queries --");
	      EntityManager em = emf.createEntityManager();
	      ExampleMain.nativeQuery(em, "Select * from Employee");
	      ExampleMain.nativeQuery(em, "Select * from FULL_TIME_EMP");
	      ExampleMain.nativeQuery(em, "Select * from PART_TIME_EMP");
	  }

	  private static void loadEntities(EntityManagerFactory emf) {
	      System.out.println("-- Loading entities --");
	      EntityManager em = emf.createEntityManager();
	      List<Employee> entityAList = em.createQuery("Select t from Employee t")
	                                     .getResultList();
	      entityAList.forEach(System.out::println);
	      em.close();
	  }
}
