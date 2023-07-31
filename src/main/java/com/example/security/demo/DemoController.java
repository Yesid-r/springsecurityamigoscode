package com.example.security.demo;

import com.example.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/demo-controller")
public class DemoController {

    @Autowired
    private UserRepository repository;
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }

/*    @GetMapping("/list")
    public List listUsers(){

        List list = repository.findAll();
        return list;

    }*/
}
