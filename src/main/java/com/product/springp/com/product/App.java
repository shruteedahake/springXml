package com.product.springp.com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Product p1=(Product) context.getBean("product1");
    	Cart cart=p1.getCart();    	
    	System.out.println(p1.toString());
    	System.out.println(cart.toString());
    }
}


