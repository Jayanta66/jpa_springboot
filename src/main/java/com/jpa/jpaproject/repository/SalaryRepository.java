package com.jpa.jpaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.jpaproject.bean.Salary;



public interface SalaryRepository extends JpaRepository<Salary, Long> {

}