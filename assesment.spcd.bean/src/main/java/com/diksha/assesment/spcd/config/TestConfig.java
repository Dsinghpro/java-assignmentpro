package com.diksha.assesment.spcd.config;

import org.springframework.context.annotation.Bean;

import com.diksha.assesment.spcd.bean.AadharCard;
import com.diksha.assesment.spcd.bean.Citizen;

public class TestConfig {
	@Bean
	
	public AadharCard adharcard() {
		return new AadharCard("1999","Vadodara","Gujarat",760710);
	}
	
	@Bean
	public Citizen citizen(){
		return new Citizen("Diksha",23,"Female",adharcard());
	}
}
