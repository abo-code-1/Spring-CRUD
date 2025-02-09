package com.example.SrpingTestCourse.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {
    private StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent() {
        return studentRepository.findAll();
    }



    public void addStudent(Student student) {
        Optional<Student> studentOptional  = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("Student with this email already e xists");
        }
        studentRepository.save(student);


    }
    public void deleteStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.deleteStudentById(student.getId());
    }

    public void deleteStudentById(Long id) {
        boolean studentExists = studentRepository.existsById(id);
        if(!studentExists){
            throw new IllegalStateException("Student with id " + id + " does not exist");
        }
        studentRepository.deleteById(id);
    }
}
