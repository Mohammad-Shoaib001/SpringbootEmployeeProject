package com.example.demo.Service;

import com.example.demo.Repository.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDetails employeeDetails;


}
