package com.example.spotifybuilddockerdemo.controller;

import com.example.spotifybuilddockerdemo.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@Slf4j
@RequestMapping("demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<Student> getStudent() {
        LocalDate localDate = LocalDate.of(1983, 7,6);
        Student student = new Student("vincent", 18, localDate);
        return new ResponseEntity(student, HttpStatus.OK);
    }

}
