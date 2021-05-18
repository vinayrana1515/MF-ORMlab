package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("javaConfig")
public class ConfigApp {
    @Bean 
    public BasketballCoach basket() {
    	return new BasketballCoach();
    }
	
	
	@Bean(initMethod="initMethod", destroyMethod="destroyMethod" )
	public Coach cricketCoach() {
		return new CricketCoach(basket());
	}
}
