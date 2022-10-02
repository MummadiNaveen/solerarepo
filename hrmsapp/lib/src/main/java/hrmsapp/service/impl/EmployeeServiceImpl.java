package hrmsapp.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import hrmsapp.dao.Employee;
import hrmsapp.exception.AllreadyExixstedException;
import hrmsapp.exception.EmployeeNotFoundException;
import hrmsapp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	Comparator<Employee> compare = (emp1, emp2) -> emp2.getSalary().compareTo(emp1.getSalary());
	private static Set<Employee> setOfEmployees = new TreeSet<>();

	@Override
	public Employee addEmployee(Employee employee) throws AllreadyExixstedException {
		if (setOfEmployees.add(employee)) {
			return employee;
		}
		throw new AllreadyExixstedException("Employee id : " + employee.getId() + " is Alredy Existed");
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
		Employee empById = setOfEmployees.stream().filter(emp -> Objects.equals(emp.getId(), id)).findFirst()
				.orElse(null);
		if (Objects.nonNull(empById)) {
			return empById;
		}
		throw new EmployeeNotFoundException("Employee id : " + id + " is Not Found");
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException, AllreadyExixstedException {
		this.deleteEmployeeById(employee.getId());
		this.addEmployee(employee);
		return employee;
	}

	@Override
	public String deleteEmployeeById(Integer id) throws EmployeeNotFoundException {
		Employee employeeById = this.getEmployeeById(id);
		setOfEmployees.remove(employeeById);
		return "Sucessfully Deleted";
	}

	@Override
	public List<Employee> getAll() {
		ArrayList<Employee> arrayList = new ArrayList<>(setOfEmployees);
		Collections.sort(arrayList, compare);
		return arrayList;
	}

}
