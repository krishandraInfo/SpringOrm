package info.inetsolv.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import info.inetsolv.model.Employee;

@Repository
public class EmployeeDao {
	
	public Employee employee;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void save(Employee emp) {
		hibernateTemplate.save(emp);
	}
	
	@Transactional
	public Employee findEmployee(Integer eno) {
		
	 employee = hibernateTemplate.get(Employee.class, eno);
		
		return employee;
		
	}
}
