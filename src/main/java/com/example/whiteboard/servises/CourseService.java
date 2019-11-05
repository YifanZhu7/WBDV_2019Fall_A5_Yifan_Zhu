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

@RestController
public class CourseService {
  Course Course1 = new Course(1, "Course1");
  Course Course2 = new Course(2, "Course2");
  Course Course3 = new Course(3, "Course3");
  Course Course4 = new Course(4, "Course4");
  Course Course5 = new Course(5, "Course5");

//  Course[] Courses = {Course1,Course2,Course3,Course4,Course5};

  List<Course> Courses = new ArrayList<Course>();
  {
    Courses.add(Course1);
    Courses.add(Course2);
    Courses.add(Course3);
    Courses.add(Course4);
    Courses.add(Course5);

  }

  @PostMapping("/api/Courses")
  public Course createCourse(
      @RequestBody Course Course){
    if(!Courses.contains(Course)) {
      Courses.add(Course);
    }
    return Course;
  }

  @DeleteMapping("/api/Courses/{inputId}")
  public void deleteCourse(
      @PathVariable("inputId") Integer id){
    for(Course Course:Courses){
      if(Course.getId().equals(id)){
        Courses.remove(Course);
      }
    }
  }

  @PutMapping("/api/Courses/{inputId}")
  public Course updateCourse(
      @PathVariable("inputId") Integer id,
      @RequestBody Course newCourse){
    for(Course Course:Courses){
      if(Course.getId().equals(id)){
        Course.setTitle(newCourse.getTitle());
        return Course;
      }
    }
    return null;
  }

  @GetMapping("/api/Courses")
  public List<Course> findAllCourse(){
    return Courses;
  }

  @GetMapping("/api/Courses/{inputId}")
  public Course findCourseById(
      @PathVariable("inputId") Integer id){
    for(Course Course:Courses){
      if(Course.getId().equals(id)){
        return Course;
      }
    }
    return null;
  }
}
