package com.hunglp.code.service;

import com.hunglp.code.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {

    List<TeacherDTO> getTeacherByMajor(String majorName);


}
