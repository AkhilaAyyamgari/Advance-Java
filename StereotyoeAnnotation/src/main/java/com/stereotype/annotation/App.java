package com.stereotype.annotation;
import com.product.controller.ProductController;
import com.product.model.ProductModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductController controller = new ProductController();
        ProductModel product= new ProductModel();
        product.setpId(1);
        product.setName("Mobile");
        product.setPrice(25000);
        product.setSeller("Samsung");
        controller.addProduct(product);
    }
}
