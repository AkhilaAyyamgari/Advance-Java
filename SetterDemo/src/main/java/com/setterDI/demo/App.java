package com.setterDI.demo;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Resource r = new ClassPathResource("applicationcontext.xml");
    BeanFactory factory= new XmlBeanFactory(r);
    
    Employee employee = (Employee)factory.getBean("employee");
    System.out.println(employee.getId());
    System.out.println(employee.getName());
    System.out.println(employee.getAddress());
    }
}