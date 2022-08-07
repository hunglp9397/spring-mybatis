package com.hunglp.code.mapper;

import com.hunglp.code.dto.MajorDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MajorMapper {


    // lấy thông tin của khoa và số giảng viên của mỗi khoa
    List<MajorDTO> getMajorWithCountTeacherOfEach();




}
