package info.inetsolv.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import info.inetsolv.model.Employee;

@Configuration
public class LoclaSessionFactoryutil {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setAnnotatedClasses(Employee.class);
		sessionFactoryBean.setHibernateProperties(hibernateProprties());
		return sessionFactoryBean;
	}

	private Properties hibernateProprties() {
		
		Properties properties = new Properties();
		
		properties.setProperty("hibernate.show_sql", "true");
		
		return properties;
		
	}
}
