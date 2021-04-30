package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	// create and configure beans
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");
    	Student ST=(Student)context.getBean("Student1");
    	System.out.println(ST);
    }
}
