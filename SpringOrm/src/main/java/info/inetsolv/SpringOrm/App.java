package info.inetsolv.SpringOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import info.inetsolv.dao.EmployeeDao;
import info.inetsolv.model.Employee;
import info.inetsolv.util.SpringOrmUtil;


public class App {
public static void main(String[] args) {
	
	
	
	
	ApplicationContext container=new AnnotationConfigApplicationContext(SpringOrmUtil.class);
	
	EmployeeDao dao = container.getBean(EmployeeDao.class);
	
	Employee employee = dao.findEmployee(1);
	
	System.out.println(employee.getName());
	  System.out.println("no reecords");
	  System.out.println("hi");
	  
	  System.out.println("bye");
	
	((AbstractApplicationContext)container).close();
}
}
