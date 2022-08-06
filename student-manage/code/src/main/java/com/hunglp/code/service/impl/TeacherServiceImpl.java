package com.hunglp.code.service.impl;

import com.hunglp.code.dto.TeacherDTO;
import com.hunglp.code.mapper.TeacherMapper;
import com.hunglp.code.service.TeacherService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public List<TeacherDTO> getTeacherByMajor(String majorName) {
        return teacherMapper.getTeacherByMajor(majorName);
    }
}
