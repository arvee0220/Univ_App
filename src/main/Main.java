package main;

import university.Course;
import university.Enrollment;
import university.Student;

public class Main {
    public static void main(String[] args) {
       Course course1 = new Course();
       Student student1 = new Student();
       Enrollment enrollment = new Enrollment();


       student1.studentId = 1236;
       student1.name = "Linus Torvalds";

       enrollment.course = course1;
       enrollment.student = student1;

       course1.courseId = 1;
       course1.courseName = "Data Structures & Algorithm";


       System.out.println("Student Information: " + "Student ID: " + enrollment.student.studentId + " Student Name: " + enrollment.student.name);
       System.out.println("Course details: " + "Course ID: " + enrollment.course.courseId + " Course Name: " + enrollment.course.courseName);

    }
}
