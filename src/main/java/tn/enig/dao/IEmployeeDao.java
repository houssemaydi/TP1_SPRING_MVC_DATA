package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.enig.model.Employee;


@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer>{
	
	
	@Query("select e from Employee e where e.dept.id =:x")
	public List<Employee> getAllEmployeeByDept(@Param("x") Integer id); 
	
	@Query("select e from Employee e where e.pr.id =:x")
	public List<Employee> getAllEmployeeByProjet(@Param("x") Integer id); 

}
