package com.techmojo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techmojo.entity.Department;
//import com.techmojo.entity.Employee;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
//	Optional<Department> findByName(String name);

}
