package hrmsapp.service;

import java.util.List;

import hrmsapp.dao.Employee;
import hrmsapp.exception.AllreadyExixstedException;
import hrmsapp.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public Employee addEmployee(Employee employee) throws AllreadyExixstedException;
	
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;
	
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException, AllreadyExixstedException;
	
	public String deleteEmployeeById(Integer id) throws EmployeeNotFoundException;
	
	public List<Employee> getAll();

}
