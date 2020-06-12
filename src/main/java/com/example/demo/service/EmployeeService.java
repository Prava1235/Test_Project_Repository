package com.example.demo.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.EmployeeRepository;
//import com.example.demo.controller.Page;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Book;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<EmployeeDTO> getEmpYearOfExpCount() {
		List<EmployeeDTO> empList = new ArrayList<>();
		empList = employeeRepository.getEmpYearOfExpCount();
		return empList;
	}
	
}
		 
		 /*List<EmployeeDTO> empdtoList= new ArrayList<EmployeeDTO>();
		 for (int i=0;i<str.size();i+=3) {
			 EmployeeDTO empdto = new EmployeeDTO ();
			 empdto.setEmpName(str.get(i));
			 String s=str.get(i+2);
			 empdto.setYearOfExp(str.get(i+1));
			 
			 empdto.setCount(Integer.parseInt(s));
			 empdtoList.add(empdto);
		 }*/
		 //.forEach(str::add)
		// List<Employee> empList = new ArrayList<Object>(str);
		//return null;
	
	
	
	



/*
 * 
 * 
 * private static void findEmployeeCountGroupBySalary() {
	      System.out.println("-- Employee count group by salary --");
	      EntityManager em = entityManagerFactory.createEntityManager();
	      Query query = em.createQuery(
	              "SELECT e.salary, COUNT(e) FROM Employee e GROUP BY e.salary");
	      List<Object[]> resultList = query.getResultList();
	      resultList.forEach(r -> System.out.println(Arrays.toString(r)));
	      em.close();
	      
	      public List<Employee> getEmpYearOfExpCount() {
		List<Employee> empList = new ArrayList<>();
		empList = employeeRepository.getEmpYearOfExpCount();
		return empList;
	}
	
	public List<Employee> getEmpYearOfExpCount() {
		List<Employee> empList = new ArrayList<>();
		 List<String> str = employeeRepository.getEmpYearOfExpCount();
		return empList;
	}
	
	public List<EmployeeDTO> getEmpYearOfExpCount() {
		List<EmployeeDTO> empList = new ArrayList<>();
		empList = employeeRepository.getEmpYearOfExpCount();
		return empList;
	}
	
	public List<EmployeeDTO> getEmpYearOfExpCount() {
		 List<Object> str = employeeRepository.getEmpYearOfExpCount();
		 
		 /*List<EmployeeDTO> empdtoList= new ArrayList<EmployeeDTO>();
		 for (int i=0;i<str.size();i+=3) {
			 EmployeeDTO empdto = new EmployeeDTO ();
			 empdto.setEmpName(str.get(i));
			 String s=str.get(i+2);
			 empdto.setYearOfExp(str.get(i+1));
			 
			 empdto.setCount(Integer.parseInt(s));
			 empdtoList.add(empdto);
		 }*/
		 //.forEach(str::add)
		// List<Employee> empList = new ArrayList<Object>(str);
		//return null;*
	
