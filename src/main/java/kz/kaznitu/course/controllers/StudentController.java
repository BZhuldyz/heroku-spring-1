package kz.kaznitu.course.controllers;

import kz.kaznitu.course.models.Student;
import kz.kaznitu.course.models.Teacher;
import kz.kaznitu.course.repositories.StudentRepository;
import kz.kaznitu.course.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @RequestMapping(value = "/admin/students", method = RequestMethod.GET)
    public String playersList(Model model){
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("teachers", teacherRepository.findAll());
        return "admin/students";
    }

    @RequestMapping(value = "/admin/students",method = RequestMethod.POST)
    public String addPlayer(@RequestParam Long teacherIId,
                            @RequestParam String firstName,
                            @RequestParam String lastName,
                            Model model) {
        Teacher teacher = teacherRepository.findOne(teacherIId);
        Student newStudent = new Student();
        newStudent.setTeacher(teacher);
        newStudent.setFirstName(firstName);
        newStudent.setLastName(lastName);
        studentRepository.save(newStudent);

        return "redirect:/admin/students";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam("id") Long id){
        studentRepository.delete(id);
        return "redirect:/admin/students";
    }

}
