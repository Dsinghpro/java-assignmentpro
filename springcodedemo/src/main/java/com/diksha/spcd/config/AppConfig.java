package com.diksha.spcd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.diksha.spcd.beans.Address;
import com.diksha.spcd.beans.Person;

@Configuration
@ComponentScan(basePackages="com.diksha.spcd.beans")
public class AppConfig {
	

}
/*@Bean
//@Scope("prototype")
public Address address() {
	return new Address("164","Sarojini Nagar","Delhi","Delhi");
}
//@Bean(initMethod = "initPerson",destroyMethod = "destPerson")
@Bean
public Person person() {
	//return new Person(5547,"James Potter",34,address());
	Person p=new Person();
	p.setAddharNo(123);
	p.setName("Ajay Sing");
	p.setAge(22);
	return p;
}*/

