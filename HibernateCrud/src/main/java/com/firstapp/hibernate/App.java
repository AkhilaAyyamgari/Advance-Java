package com.firstapp.hibernate;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
public class App 
{
    public static void main( String[] args )
    {
     StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
     Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
     SessionFactory sessionfactory= metadata.getSessionFactoryBuilder().build();
     System.out.println("sessionfactory" + sessionfactory);
     Session session = sessionfactory.openSession();
     Transaction transaction = session.beginTransaction();
    
    //create
//    User user = new User();
//    user.setUsername("Saarvi");
//    user.setPassword("saru123");
//    user.setEmail("saru@gmail.com");
//    session.save(user);
    
    //Delete
//    User user = new User();
//    user.setId(5);
//    user.setUsername("Akhila");
//    user.setPassword("akhi123");
//    user.setEmail("akhila@gmail.com");
//    session.delete(user);
     
//     //update
//     User user = new User();
//     user.setId(3);
//     user.setUsername("Ridhi");
//     user.setPassword("ridhi123");
//     user.setEmail("ridhi@gmail.com");
//     session.update(user);
     //retrieval
    Query<User> query = session.createQuery("from User");
    List<User> list = query.list();
    Iterator<User> iterator = list.iterator();
    
    while(iterator.hasNext()) {
    	User u1 = iterator.next();
    	System.out.println(u1.getId() +"\t"+ u1.getUsername() +"\t"+ u1.getPassword()+"\t"+ u1.getEmail());
    }
    transaction.commit();
    }

	
}
