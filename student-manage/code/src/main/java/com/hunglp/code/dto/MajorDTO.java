package com.hunglp.code.dto;

import lombok.Data;

@Data
public class MajorDTO {

    private String majorId;

    private String majorName;

    private String phoneNumber;

    private int numOfTeacher; // Số giảng viên của mỗi khoa

}
