package kz.kaznitu.course.models;

import javax.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;

    private String last_name;

    private String first_name;

    public Teacher() {
    }

    public Teacher(String last_name, String first_name) {
        this.last_name = last_name;
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}

