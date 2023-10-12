package com.springboot.springboot.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retreiveAllCourse(){
        return Arrays.asList( new Course(1, "Learn spring", "In28Min"));
    }
}
