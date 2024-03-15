package com.udemy.spring.bootrestfulwebservices.departmentservice.repository;

import com.udemy.spring.bootrestfulwebservices.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentCode(String departmentCode);
}
