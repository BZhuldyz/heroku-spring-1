package kz.kaznitu.course.repositories;

import kz.kaznitu.course.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
