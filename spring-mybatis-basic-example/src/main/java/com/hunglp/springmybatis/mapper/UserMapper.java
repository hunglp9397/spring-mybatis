package com.hunglp.springmybatis.mapper;

import com.hunglp.springmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getById(Long id);

    List<User> getAllUser();

}
