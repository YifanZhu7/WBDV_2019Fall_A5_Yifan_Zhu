package com.example.whiteboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "modules")
public class Module {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  @OneToMany
  @JsonIgnore
  private Course course;

  public Module(){}

  public List<Widget> getWigets() {
    return widgets;
  }

  public void setWidget(List<Widget> widgets) {
    this.widgets = widgets;
  }

  @OneToMany(mappedBy = "module")
  private List<Widget> widgets;


  public List<Widget> getWidgets() {return widgets; }

  public void setWidgets(List<Widget> widgets) { this.widgets = widgets; }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


//  public Module(Integer id,String title, List<Widget> widgets) {
//    this.id = id;
//    this.title = title;
//    this.widgets = widgets;
//
//  }

}
