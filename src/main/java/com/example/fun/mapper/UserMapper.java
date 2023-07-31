package com.example.fun.mapper;
import com.example.fun.domain.User;
import com.example.fun.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface UserMapper {

//        @Insert("INSERT INTO USERS (name) VALUES(#{name})")
//
//        //     @Insert("INSERT INTO USERS (name) VALUES(#{name})")
//        //     @Options(useGeneratedKeys = true, keyProperty = "id")
//        int insert(User user);

        //    @Insert("INSERT INTO USERS (name) VALUES (#{name})")
        // int insert(User user);

//        @Select("select * from Users")
//        List<User> findAllStudents();

        @Select("select * from Users where id=#{id}")
        User findStudent(int id);


}
