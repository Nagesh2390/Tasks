package com.sriraj.cfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.sriraj")
@PropertySource("classpath:oracle.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
	
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("driver"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("user"));
		ds.setPassword(env.getProperty("password"));
	return ds;}
	
}
