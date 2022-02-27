															package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;


@CrossOrigin("*")
@RestController
@RequestMapping("/app")
public class EmployeeController {

	 @Autowired
	 private EmployeeService employeeService;
	 @Autowired
	 private EmployeeRepository employeeRepository;
	 
	 @GetMapping("/empl")
	 public Iterable<Employee> getEmployees(){
		 return employeeService.getemployee();
	 }
	 @PostMapping(path = "/addemployee")
	 public void addEmployee(@RequestBody Employee employee) {
	        employeeService.saveEmployee(employee);
	        System.out.println("connexion au controleur reussi");
	 }
	 @DeleteMapping("/empl/{matricule}")
	  public void deleteTutorial(@org.springframework.web.bind.annotation.PathVariable("matricule") Long matricule) {
		 employeeRepository.deleteById(matricule);
	  }
     @PutMapping("/empl/{id}")
     public Employee  update(@PathVariable Long id, @RequestBody Employee empl) {
    	 Employee employee = employeeRepository.findById(id).orElse(null);
    	 employee.setNom(empl.getNom());
    	 employee.setPrenom(empl.getPrenom());
    	 employee.setGrade(empl.getGrade());
    	
    	 Employee  updatempl = employeeRepository.save(employee);
    	 return updatempl;
     }
}
