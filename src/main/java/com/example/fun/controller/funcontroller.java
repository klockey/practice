package com.example.fun.controller;

import com.example.fun.domain.User;
import com.example.fun.mapper.UserMapper;
import com.example.fun.service.InsertService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class funcontroller {


 //   private final UserMapper userMapper;
    List<User> users = new ArrayList<>();
    private final InsertService insertService;

//    @Autowired
//    InsertService insertService;

//    @Autowired
//    UserMapper userMapper;


//    @Autowired
//    //@Qualifier("clientService")
//    public void setInsertService(InsertService insertService){
//        this.insertService=insertService;
//    }

    public funcontroller(InsertService insertService){
        this.insertService = insertService;
    }

    @GetMapping("/")
    public String listUsers(Model model) {
        User user = new User();
       // user.setId(Long.valueOf(1));
        user.setName("keith");
        model.addAttribute("users", users);
        return "home";
    }

    @PostMapping("/")
     public String postView(Model model, @RequestParam("id") Long id, @RequestParam("name") String name) {

//        System.out.println(id);
//        System.out.println(name);
//
//        User user = new User();
//
//     //   user.setId(null);
//        user.setName(name);
//        users.add(user);
//
//        model.addAttribute("users", users);
//
//     //   insertService.uploadNote(user);
//
//        List<User> l = insertService.selectAllUsers();
//
//        for(User u : l){
//            System.out.println(u.getName());
//        }


        User u = insertService.selectUser(1);

        System.out.println(u.getName());

        return "home";
    }
}
