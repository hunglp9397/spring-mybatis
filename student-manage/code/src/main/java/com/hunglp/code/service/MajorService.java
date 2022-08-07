package com.hunglp.code.service;

import com.hunglp.code.dto.MajorDTO;

import java.util.List;

public interface MajorService {

    List<MajorDTO> getMajorWithCountTeacherOfEach();

    List<MajorDTO> getMajorWithCountStudentOfEach();

}
