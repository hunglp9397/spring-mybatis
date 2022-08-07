package com.hunglp.code.service.impl;

import com.hunglp.code.dto.StudentDTO;
import com.hunglp.code.entity.Student;
import com.hunglp.code.mapper.StudentMapper;
import com.hunglp.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudentNotAttendIntern() {
        return studentMapper.getStudentNotAttendIntern();
    }

    @Override
    public List<StudentDTO> getStudentGuidedByTeacher(String teacherName) {
        return studentMapper.getStudentGuidedByTeacher(teacherName);
    }
}
