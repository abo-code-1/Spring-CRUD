package com.example.SrpingTestCourse.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController {


    //----------------Внедрение зависимостей---------------
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //----------------------------------------------------


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudent();
    }


    @PostMapping    
    public void registerNewStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
   public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudentById(id);
    }


}
