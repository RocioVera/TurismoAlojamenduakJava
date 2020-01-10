package net.codejava.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import eredua.ostatuak;


public class ostatuManager {
	

	protected SessionFactory sessionFactory;
 	
 	
 	
 	protected void create(ostatuak Ost) {
 		
 	
 	    Session session = sessionFactory.openSession();
 	    session.beginTransaction();
 	 
 	    session.save(Ost);
 	 
 	    session.getTransaction().commit();
 	    session.close();
     }
 	protected void exit() {
 		sessionFactory.close();
     }
 	protected void setup() {
 		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
 		        .configure() // configures settings from hibernate.cfg.xml
 		        .build();
 		try {
 		    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
 		} catch (Exception ex) {
 			System.out.println(ex.getMessage());
 		    StandardServiceRegistryBuilder.destroy(registry);
 		}
     }
 	
 	
 	public static void main(ostatuak Ost) {
 		  ostatuManager manager = new ostatuManager();
 		    manager.setup();
 		    manager.create(Ost);
 		    manager.exit();

 	}

}
