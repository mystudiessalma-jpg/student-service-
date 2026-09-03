package com.salma.StudentService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(  "'test")
@CrossOrigin("*")
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<> hello(){
        retrun new ResponseEntity("hello",HttpStatus.OK);
    }
}
