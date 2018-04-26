package kz.kaznitu.course.repositories;

import kz.kaznitu.course.models.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
