package com.mehmet.teachers.controller;

import com.mehmet.teachers.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping()
    public ResponseEntity<String> insertTeacher (@RequestHeader("name") String name,
                                 @RequestHeader("surname") String surname,
                                 @RequestHeader("department") String department,
                                 @RequestHeader("feature") String feature){


        return new ResponseEntity<>(teacherService.insertTeacher(name,surname,department,feature), HttpStatus.OK);
    }
}
