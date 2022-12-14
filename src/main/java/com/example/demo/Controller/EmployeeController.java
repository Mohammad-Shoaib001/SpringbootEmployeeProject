package com.example.demo.Controller;


import com.example.demo.Dto.EmployeeDetailsDTO;
import com.example.demo.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping
    public ResponseEntity<List<EmployeeDetailsDTO>> employeeDetailsDTO(){
        return null;
    }
}
