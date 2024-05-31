package spring.repository;


import spring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<Student,Long> {

}
