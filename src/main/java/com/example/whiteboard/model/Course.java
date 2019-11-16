package com.example.whiteboard.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;

  @OneToMany(mappedBy = "course")
  private List<Module> modules = new ArrayList<>();



  public List<Module> getModules() {
    return modules;
  }

  public void setModules(List<Module> modules) {
    this.modules = modules;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Course(){}

  public void set(Course newCourse){
    this.id = newCourse.id;
    this.title = newCourse.title;

  }
//  public Course(Integer id, String title, List<Module> modules) {
//    this.id = id;
//    this.title = title;
//  }
}
