package io.course.CourseDemo.service;

import io.course.CourseDemo.model.Course;
import io.course.CourseDemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class CourseServiceImpl implements  CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course getCourse(int id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Collection<Course> getAllCourses() {
        List<Course> allCourses = new ArrayList<>();
        courseRepository.findAll().forEach(allCourses::add);
        return allCourses;
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void updateCourse(int id) {
        Course course = getCourse(id);
        courseRepository.save(course);
    }

    @Override
    public Course deleteCourse(int id) {
        Course course = getCourse(id);
        courseRepository.deleteById(id);
        return course;
    }
}
