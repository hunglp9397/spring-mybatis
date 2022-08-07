package com.hunglp.code.service.impl;

import com.hunglp.code.dto.MajorDTO;
import com.hunglp.code.mapper.MajorMapper;
import com.hunglp.code.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;

    @Override
    public List<MajorDTO> getMajorWithCountTeacherOfEach() {
        return majorMapper.getMajorWithCountTeacherOfEach();
    }
}
