package com.jpa.jpaproject.repository;

//package com.springboot.springboot.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.jpaproject.bean.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}