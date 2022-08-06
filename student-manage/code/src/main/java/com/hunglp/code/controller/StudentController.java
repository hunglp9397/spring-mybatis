package com.hunglp.code.controller;

import com.hunglp.code.dto.StudentDTO;
import com.hunglp.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/not-attend-intern")
    private List<StudentDTO> getStudentNotAttendIntern(){
        return studentService.getStudentNotAttendIntern();
    }
}
