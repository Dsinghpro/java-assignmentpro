package com.diksha.springcodedemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import java.util.Map.Entry;
//import com.diksha.spcd.beans.Country;
import com.diksha.spcd.beans.Person;
import com.diksha.spcd.config.AppConfig;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

//import com.diksha.spcd.beans.Person;
//import com.diksha.spcd.beans.Wish;

public class App 
{
    public static void main( String[] args )
    {
    	//JavaConfig
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    	Person p = container.getBean(Person.class);
    	
    	System.out.println(p.getAddharNo()+" "+p.getAge()+" "+p.getName());
    	System.out.println(p.getAddress());
     }
}
//Singleton method


// ClassPathXmlApplicationContext container =new  ClassPathXmlApplicationContext("beans.xml");
//Wish w1=container.getBean("wish1",Wish.class);
//System.out.println(w1.getMessage());
//Wish w2=container.getBean("wish1",Wish.class);
//w2.setMessage("Spring Welcomes You");
//System.out.println(w1.getMessage());
//System.out.println(w2.getMessage());

// container.close();
 //for prototype
 //add scope="prototype" in bean.xml and above code will have 2 container /Destroy method is not called in prototype method
//adding lazy-init it will not eagerly use//it will create when there is a request from the program 



//if bean.xml is located in file then we use Filesystemapplicationcontext
//FileSystemXmlApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\DSingh\\Desktop\\Prolifics\\beans.xml");
//Wish w=container.getBean("wish1",Wish.class);







//	Country c=container.getBean("cntry" ,Country.class);
//	System.out.println("Country Name:-"+c.getCountryName());
//	System.out.println("Currency Name:-"+c.getCurrencyName());
//	System.out.println("States:-");
	
//	for(String s:c.getStates())//for list and set
//		System.out.println(s);
//	for(Entry<String,String> e:c.getStates().entrySet())//for map
//		System.out.println(e.getKey()+" "+e.getValue());
//	container.close();

//ClassPathXmlApplicationContext container =new  ClassPathXmlApplicationContext("beans.xml");
//FileSystemXmlApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\DSingh\\Desktop\\Prolifics\\beans.xml");
//Person p = container.getBean("showper",Person.class);
//Person p = container.getBean(Person.class);
//
//System.out.println(p.getAddharNo()+" "+p.getAge()+" "+p.getName());
//System.out.println(p.getAddress());

