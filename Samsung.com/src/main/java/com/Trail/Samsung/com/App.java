package com.Trail.Samsung.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new AnnotationConfigApplicationContext(Congifure.class);
    	
    	Samsung s7=context.getBean(Samsung.class);
    	s7.info();
    }
}
