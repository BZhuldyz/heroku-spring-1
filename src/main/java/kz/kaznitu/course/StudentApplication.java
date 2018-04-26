package kz.kaznitu.course;

import kz.kaznitu.course.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

    @Autowired
    TeacherRepository teacherRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception{

    }
}
