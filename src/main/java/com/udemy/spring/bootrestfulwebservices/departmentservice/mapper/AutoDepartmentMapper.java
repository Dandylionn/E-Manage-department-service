package com.udemy.spring.bootrestfulwebservices.departmentservice.mapper;

import com.udemy.spring.bootrestfulwebservices.departmentservice.dto.DepartmentDto;
import com.udemy.spring.bootrestfulwebservices.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoDepartmentMapper {
    AutoDepartmentMapper MAPPER = Mappers.getMapper(AutoDepartmentMapper.class);
    DepartmentDto mapToDepartmentDto(Department department);
    Department mapToDepartment(DepartmentDto departmentDto);
}
