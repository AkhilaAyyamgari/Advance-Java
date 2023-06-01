package SpringConstructorDiObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    
    Product p = (Product) context.getBean("product");
    System.out.println(p.getProductId());
    System.out.println(p.getName());
    System.out.println(p.getPrice());
    System.out.println(p.getSeller().getSellername());
    
    }
}
