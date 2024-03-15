package com.udemy.spring.bootrestfulwebservices.departmentservice.service.impl;

import com.udemy.spring.bootrestfulwebservices.departmentservice.dto.DepartmentDto;
import com.udemy.spring.bootrestfulwebservices.departmentservice.entity.Department;
import com.udemy.spring.bootrestfulwebservices.departmentservice.mapper.AutoDepartmentMapper;
import com.udemy.spring.bootrestfulwebservices.departmentservice.repository.DepartmentRepository;
import com.udemy.spring.bootrestfulwebservices.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        //convert department dto to department jpa entity
        //Mapstruct method
        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        DepartmentDto savedDepartmentDto = AutoDepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);


        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
    }
}
