package io.course.CourseDemo.contoller;

import io.course.CourseDemo.model.Course;
import io.course.CourseDemo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class CourseControllerImpl implements CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course/{id}")
    @Override
    public Course getCourse(@PathVariable int id) {
        return courseService.getCourse(id);
    }

    @GetMapping("/courses")
    @Override
    public Collection<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/courses")
    @Override
    public void addCourse(@RequestBody Course course) {
        System.out.println(course.getId());
        courseService.addCourse(course);
    }

    @PutMapping("/course/{id}")
    @Override
    public void updateCourse(@PathVariable int id) {
        courseService.updateCourse(id);
    }

    @DeleteMapping("/course/{id}")
    @Override
    public Course deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id);
    }
}
