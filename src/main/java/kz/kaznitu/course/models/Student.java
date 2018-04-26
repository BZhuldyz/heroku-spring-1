package kz.kaznitu.course.models;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    private String firstName;

    private String lastName;

    @ManyToOne
    private Teacher teacher;

    public Student() {
    }

    public Student(String firstName, String lastName, Teacher teacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacher = teacher;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
