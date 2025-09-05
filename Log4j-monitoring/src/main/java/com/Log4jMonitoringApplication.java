package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Log4jMonitoringApplication {
	
	static Logger s=Logger.getLogger(Log4jMonitoringApplication.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		s.warn("check the code");
		
		SpringApplication.run(Log4jMonitoringApplication.class, args);
		
		s.info("code does not have issue");
	}

}
