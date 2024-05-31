package spring.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.entity.Student;
import spring.repository.studentrepository;
import spring.service.studentservice;

@Service
@AllArgsConstructor
public class studentserviceimpl implements studentservice {
    private studentrepository sr;

    @Override
    public Student createStudent(Student s) {
        Student student = sr.save(s);
        return student;
    }
}
