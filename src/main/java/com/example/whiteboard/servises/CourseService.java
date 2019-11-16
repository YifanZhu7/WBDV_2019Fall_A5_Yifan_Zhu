package com.example.whiteboard.servises;

import com.example.whiteboard.model.Course;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class CourseService {
//  Course Course1 = new Course(1, "course1");
//  Course Course2 = new Course(2, "course2");
//  Course Course3 = new Course(3, "course3");
//  Course Course4 = new Course(4, "course4");
//  Course Course5 = new Course(5, "course5");
//
////  Course[] Courses = {Course1,Course2,Course3,Course4,Course5};
//
//  List<Course> Courses = new ArrayList<Course>();
//  {
//    Courses.add(Course1);
//    Courses.add(Course2);
//    Courses.add(Course3);
//    Courses.add(Course4);
//    Courses.add(Course5);
//
//  }
//
//  @PostMapping("/api/courses")
//  public Course createCourse(
//      @RequestBody Course course){
//    if(!Courses.contains(course)) {
//      Courses.add(course);
//    }
//    return course;
//  }
//
//  @DeleteMapping("/api/courses/{inputId}")
//  public void deleteCourse(
//      @PathVariable("inputId") Integer id){
//    for(Course course:Courses){
//      if(course.getId().equals(id)){
//        Courses.remove(course);
//      }
//    }
//    return;
//  }
//
//  @PutMapping("/api/courses/{inputId}")
//  public Course updateCourse(
//      @PathVariable("inputId") Integer id,
//      @RequestBody Course newCourse){
//    for(Course course:Courses){
//      if(course.getId().equals(id)){
//        course.setTitle(newCourse.getTitle());
//        return course;
//      }
//    }
//    return null;
//  }
//
//  @GetMapping("/api/courses")
//  public List<Course> findAllCourse(){
//    return Courses;
//  }
//
//  @GetMapping("/api/courses/{inputId}")
//  public Course findCourseById(
//      @PathVariable("inputId") Integer id){
//    for(Course course:Courses){
//      if(course.getId().equals(id)){
//        return course;
//      }
//    }
//    return null;
//  }
//}
