package com.example.security.auth;

import com.example.security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthenticationController {

    private final AuthenticationService service;
    private final UserRepository repository;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (@RequestBody RegisterRequest request){

        System.out.println(request.toString());
            return ResponseEntity.ok(service.register(request));

    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (@RequestBody AuthenticationRequest request){
        System.out.println("user to search: " + request.getEmail());
        return ResponseEntity.ok(service.authenticate(request));
    }
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        System.out.println("hello");
        return ResponseEntity.ok("Hello from secured endpoint");
    }
    @GetMapping("/list")
    public List listUsers(){

        List list = repository.findAll();
        return list;

    }
    //lisstar usuarios

    //eliminar usuarios
    //actualizar usuarios
    //buscar usuarios
    //buscar usuario por id
    //buscar usuario por email


}
