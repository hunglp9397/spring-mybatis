package com.hunglp.code.mapper;


import com.hunglp.code.dto.TeacherDTO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScans;

import java.util.List;

@Mapper
public interface TeacherMapper {

    List<TeacherDTO> getTeacherByMajor(String majorName);

    // Lấy thông tin gồm mã giảng viên, tên giảng viên , khoa của các giảng viên hướng dẫn từ 1 sinh viên trở lên
    List<TeacherDTO> getTeacherWithMajorWhoGuideGreaterThanOneStudent();


}
