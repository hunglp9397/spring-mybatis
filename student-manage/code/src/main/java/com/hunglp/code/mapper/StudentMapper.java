package com.hunglp.code.mapper;

import com.hunglp.code.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<StudentDTO> getStudentNotAttendIntern();

    List<StudentDTO> getStudentGuidedByTeacher(String teacherName);
}
