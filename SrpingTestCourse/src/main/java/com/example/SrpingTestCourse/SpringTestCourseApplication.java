package com.example.SrpingTestCourse;

import com.example.SrpingTestCourse.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController

public class SpringTestCourseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringTestCourseApplication.class, args);
	}

}
