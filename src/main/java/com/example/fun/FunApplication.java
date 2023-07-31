package com.example.fun;

import com.example.fun.domain.User;
import com.example.fun.mapper.UserMapper;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.fun.mapper"})
@MappedTypes({User.class})
public class FunApplication {
	public static void main(String[] args) {
		SpringApplication.run(FunApplication.class, args);
	}
}
