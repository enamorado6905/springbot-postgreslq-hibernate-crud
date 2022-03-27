package com.springbot.springbotpostgreslqhibernatecrud.repository;

import com.springbot.springbotpostgreslqhibernatecrud.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
