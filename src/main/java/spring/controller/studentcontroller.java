package spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.entity.Student;
import spring.service.studentservice;

@RestController
@AllArgsConstructor
@RequestMapping("api/student/")
public class studentcontroller {
    private studentservice ss;

    @PostMapping("createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student s){
        Student student = ss.createStudent(s);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
