package com.udemy.spring.bootrestfulwebservices.departmentservice.service;

import com.udemy.spring.bootrestfulwebservices.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
}
