package com.firstapp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    StandardServiceRegistry serviceRegistry  = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
    SessionFactory sessionfactory =  metadata.getSessionFactoryBuilder().build();
    System.out.println("sessionfactory" + sessionfactory);
    Session session = sessionfactory.openSession();
    Transaction transaction = session.beginTransaction();
   //  Create
    Movie movie = new Movie();
    movie.setId(1);
    movie.setName("RRR");
    movie.setReleaseDate("20March");
    movie.setBudget(234568799);
    session.save(movie); 
    transaction.commit();
    
    }
}
