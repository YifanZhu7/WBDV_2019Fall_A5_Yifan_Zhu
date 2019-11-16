package com.example.whiteboard.repositories;

import com.example.whiteboard.model.Course;
import com.example.whiteboard.model.Module;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CourseRepository
    extends CrudRepository<Course, Integer> {

  @Query("select course from Course course where course.id=courseId")
  public Course findCourseById(@Param("courseId") Integer id);

  @Query("select course from Course course")
  public List<Course> findAllCourses();
}
