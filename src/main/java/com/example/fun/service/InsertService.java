package com.example.fun.service;
import com.example.fun.domain.User;
import com.example.fun.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InsertService {
//
     @Autowired
     UserMapper userMapper;
//
//    public InsertService(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }
//
////    public int uploadNote(User user) {
////        return userMapper.insert(user);
////    }
//
//    public List<User> selectAllUsers(){
//       return userMapper.findAllStudents();
//    }

    public User selectUser(int i){
        return userMapper.findStudent(i);
    }

}
