package com.diksha.assesment.spcd.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diksha.assesment.spcd.config.TestConfig;

public class App 
{
    public static void main( String[] args )
    {
    	//ClassPathXmlApplicationContext container =new  ClassPathXmlApplicationContext("NewFile.xml");
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(TestConfig.class);
//    	Citizen c=container.getBean("citi",Citizen.class);
    	Citizen c=container.getBean(Citizen.class);
    	System.out.println(c.getAge()+" "+c.getGender()+" "+c.getName());
    	System.out.println(c.getAdharcard());
    }
}
