package io.course.CourseDemo.contoller;

import io.course.CourseDemo.model.Course;

import java.util.Collection;

public interface CourseController {
    public Course getCourse(int id);
    public Collection<Course> getAllCourses();
    public void updateCourse(int id);
    public void addCourse(Course course);
    public Course deleteCourse(int id);
}
