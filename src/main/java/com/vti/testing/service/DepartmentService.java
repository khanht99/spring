package com.vti.testing.service;

import com.vti.testing.entity.Department;
import com.vti.testing.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // class thuoc layer service
public class DepartmentService implements IDepartmentService{

    @Autowired // tu khoi tao doi tuong
    private IDepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
