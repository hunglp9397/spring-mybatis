package com.hunglp.code.controller;

import com.hunglp.code.dto.MajorDTO;
import com.hunglp.code.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MajorController {

    @Autowired
    private MajorService majorService;

    @GetMapping("/majors/with-count-teacher-of-each")
    public List<MajorDTO> getMajorWithCountTeacherOfEach(){
        return majorService.getMajorWithCountTeacherOfEach();
    }

    @GetMapping("/majors/with-count-student-of-each")
    public List<MajorDTO> getMajorWithCountStudentOfEach(){
     return majorService.
    }
}
