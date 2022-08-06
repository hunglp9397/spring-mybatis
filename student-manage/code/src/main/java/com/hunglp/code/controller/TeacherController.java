package com.hunglp.code.controller;


import com.hunglp.code.dto.TeacherDTO;
import com.hunglp.code.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    List<TeacherDTO> getTeacherByMajor(@RequestParam("majorName") String majorName){

        return teacherService.getTeacherByMajor(majorName);

    }
}
