package com.example.whiteboard.controllers;

import com.example.whiteboard.model.Course;
import com.example.whiteboard.model.Widget;
import com.example.whiteboard.repositories.CourseRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin(origins = "*")

public class CourseController {

  @Autowired
  CourseRepository repository;

//  Course Course1 = new Course(1, "course1");
//  Course Course2 = new Course(2, "course2");
//  Course Course3 = new Course(3, "course3");
//  Course Course4 = new Course(4, "course4");
//  Course Course5 = new Course(5, "course5");

//  Course[] Courses = {Course1,Course2,Course3,Course4,Course5};

//  List<Course> Courses = new ArrayList<Course>();
//
//  {
//    Courses.add(Course1);
//    Courses.add(Course2);
//    Courses.add(Course3);
//    Courses.add(Course4);
//    Courses.add(Course5);
//
//  }

  @PostMapping("/api/courses")
  public List<Course> createCourse(
      @RequestBody Course course) {
    repository.save(course);
    return findAllCourse();
//    if (!Courses.contains(course)) {
//      Courses.add(course);
//    }
//    return course;
  }

  @DeleteMapping("/api/courses/{inputId}")
  public void deleteCourse(
      @PathVariable("inputId") Integer id) {
    repository.deleteById(id);
//    for (Course course : Courses) {
//      if (course.getId().equals(id)) {
//        Courses.remove(course);
//      }
//    }
//    return;
  }

  @PutMapping("/api/courses/{inputId}")
  public List<Course> updateCourse(
      @PathVariable("inputId") Integer id,
      @RequestBody Course newCourse) {
    repository.save(newCourse);
    return repository.findAllCourses();
//    for (Course course : Courses) {
//      if (course.getId().equals(id)) {
//        course.setTitle(newCourse.getTitle());
//        return course;
//      }
//    }
//    return null;
  }

  @GetMapping("/api/courses")
  public List<Course> findAllCourse() {
    return repository.findAllCourses();
//    return (List<Course>) repository.findAll();
  }

  @GetMapping("/api/courses/{inputId}")
  public Course findCourseById(
      @PathVariable("inputId") Integer id) {
    return repository.findCourseById(id);
//    Optional<Course> c = repository.findById(id);
//    if (c.isPresent()) {
//      return c.get();
//    }
//    return null;
//    for(Course course:Courses){
//      if(course.getId().equals(id)){
//        return course;
//      }
//    }
//    return null;
//  }
  }
}
