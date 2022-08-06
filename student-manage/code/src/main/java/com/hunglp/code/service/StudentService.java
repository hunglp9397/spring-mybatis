package com.hunglp.code.service;

import com.hunglp.code.dto.StudentDTO;
import com.hunglp.code.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDTO> getStudentNotAttendIntern();
}
