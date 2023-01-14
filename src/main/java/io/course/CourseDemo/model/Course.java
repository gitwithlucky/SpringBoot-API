package io.course.CourseDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Course {
    @Id
    private Integer id;
    private String courseTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getNoOfStudentOfferingMe() {
        return noOfStudentOfferingMe;
    }

    public void setNoOfStudentOfferingMe(int noOfStudentOfferingMe) {
        this.noOfStudentOfferingMe = noOfStudentOfferingMe;
    }

    public String getCourseCoordinator() {
        return courseCoordinator;
    }

    public void setCourseCoordinator(String courseCoordinator) {
        this.courseCoordinator = courseCoordinator;
    }

    private int noOfStudentOfferingMe;
    private String courseCoordinator;
//    private Date finalExamDate;
}
