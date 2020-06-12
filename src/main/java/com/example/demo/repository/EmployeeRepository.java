package com.example.demo.repository;


import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;


	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Integer>,PagingAndSortingRepository<Employee, Integer> {
			
		@Query(value="select new com.example.demo.dto.EmployeeDTO(emp.empName,emp.yearOfExp,count(*)) from Employee emp group by  yearOfExp")
		public List< EmployeeDTO> getEmpYearOfExpCount();
		
		
			  

		}

	
	
	/*
	@Query(value="SELECT count(*) count,CASE  WHEN  yearofexp < 5  THEN 'Junior Level Employee' WHEN  yearofexp  between 5  and 10 THEN 'Mid Level Employee'  ELSE 'High Level Employee' END  Level FROM Employee GROUP BY Level",nativeQuery=true)
	public List<Map<String,Object>> getEmpYearOfExpCount();

	}
	
	
	   

/*
@Query(value="select new com.example.demo.dto.EmployeeDTO(emp. yearOfExp,count(*)) from Employee emp group by  yearOfExp")
public List< EmployeeDTO> getEmpYearOfExpCount();

//
 * working
 * 
 * @Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>,PagingAndSortingRepository<Employee, Integer> {
		
	@Query(value="select new com.example.demo.dto.EmployeeDTO(emp.empName,emp.yearOfExp,count(*)) from Employee emp group by  yearOfExp")
	public List< EmployeeDTO> getEmpYearOfExpCount();

	}

}*/


/*@Query(value="select emp.empName,emp.yearOfExp,COUNT(*) from  Employee emp GROUP BY  emp.yearOfExp")
//public List<Employee> getEmpYearOfExpCount();
public List<EmployeeDTO> getEmpYearOfExpCount();*/