package hrmsapp.ui;

import java.util.List;

import hrmsapp.dao.Address;
import hrmsapp.dao.Employee;
import hrmsapp.exception.AllreadyExixstedException;
import hrmsapp.exception.EmployeeNotFoundException;
import hrmsapp.service.EmployeeService;
import hrmsapp.service.impl.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		Address address = new Address(1,"naidupeta","Ap");
		Address address2 = new Address(2,"tirupati","ap");
		Employee employee1 = new Employee(1,"jagadhish",35.0, address);
		Employee employee2 = new Employee(2,"Samara",25.0, address2);
		Employee employee3 = new Employee(3,"Venky",30.0, address);
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		try {
			employeeService.addEmployee(employee1);
			employeeService.addEmployee(employee2);
			employeeService.updateEmployee(employee3);
			System.out.println(employeeService.deleteEmployeeById(2));
			List<Employee> all = employeeService.getAll();
			for(Employee e : all)
			System.out.println(e);
			
		} catch ( AllreadyExixstedException  e) {
			System.out.println(e.getMsg());
		} catch (EmployeeNotFoundException e1) {
			System.out.println(e1.getMsg());
		}

	}

}
