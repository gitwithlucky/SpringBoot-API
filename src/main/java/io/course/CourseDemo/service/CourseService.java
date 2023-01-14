package io.course.CourseDemo.service;

import io.course.CourseDemo.model.Course;

import java.util.Collection;

public interface CourseService {
    public Course getCourse(int id);
    public Collection<Course> getAllCourses();
    public void addCourse(Course course);
    public void updateCourse(int id);
    public Course deleteCourse(int id);
}
