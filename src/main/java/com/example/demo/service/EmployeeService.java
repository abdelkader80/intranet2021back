package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.entities.Employee;
import lombok.Data;

@Service
@Data
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Iterable<Employee> getemployee(){
		return employeeRepository.findAll();
		
	}
	
	
	public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        System.out.println("Test Ervice");   
        return savedEmployee;
    }
	/*
	 * public Employee deleteEmployee(Employee employee) { Employee deleteEmployee =
	 * employeeRepository. return deleteEmployee; }
	 */
	
//	public Employee Updateemp(Employee employee, long matricule) {
//		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
//			() -> new  ResourceNotFoundException("Employee", matricule));
//		existingEmployee.setMatricule(employee.getMatricule());
//		existingEmployee.setNom(employee.getNom());
//		existingEmployee.setPrenom(employee.getPrenom());
//		existingEmployee.setGrade(employee.getGrade());
//		employeeRepository.save(existingEmployee);
//		return existingEmployee;
//	}
	
	
}
