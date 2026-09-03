package com.salma.StudentService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin("*")
public class TestController {
    @GetMapping("/hi")
    public ResponseEntity<?> hi() {
        return new ResponseEntity<>("hi", HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<?> getStudents();

    Map<String, Integer> students = new HashMap<>();
    students.put("salma,21");
    students.put("sabiha,22");
    students,put("suhana,20");
    students,put("sabbu,23");
    return new ResponseEntity<>(students,Httpstatus,)

}
