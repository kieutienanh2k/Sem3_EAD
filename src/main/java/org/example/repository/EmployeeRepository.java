package org.example.repository;

import org.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long>, JpaSpecificationExecutor {
    @Query("SELECT e FROM Employee e")
    List<Employee> findAllEmployees();
    @Query("SELECT e FROM Employee e WHERE e.name = :value1")
    List<Employee> findByName(@Param("value1") String name);
}
