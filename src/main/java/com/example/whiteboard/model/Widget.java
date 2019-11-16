package com.example.whiteboard.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="widgets")
public class Widget {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String text;
  private Integer size;

  public enum type{HEADING,LIST,PARAGRAPH,IMAGE,LINK};
  private String widgetType;


  public String getText() {
    return text;
  }

  public void setTitle(String text) {
    this.text = text;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getWidgetType() {
    return widgetType;
  }

  public void setWidgetType(String widgetType) {
    this.widgetType = widgetType;
  }

  public Widget(){}
  public Widget(String text, Integer id, Integer size, type type) {
    this.text = text;
    this.id = id;
    this.size = size;
    this.widgetType="";

    switch (type){
      case HEADING:
        this.widgetType="HEADING";
        break;
      case LIST:
        this.widgetType="LIST";
        break;
      case PARAGRAPH:
        this.widgetType="PARAGRAPH";
        break;
      case IMAGE:
        this.widgetType="IMAGE";
        break;
      case LINK:
        this.widgetType="LINK";
        break;
    }
  }
  //  private String name;
//  private Integer id;
//
//  public enum type{HEADING,LIST,PARAGRAPH,IMAGE,LINK};
//
//  private String widgetType;
//  private Boolean order;
//  private String text;
//  private String src;
//
//  public Widget(String name, Integer id, Boolean order, String text,
//      String src, Integer size, type type) {
//    this.name = name;
//    this.id = id;
//    this.order = order;
//    this.text = text;
//    this.src = src;
//    this.size = size;
//    this.widgetType = "";
//
//    switch (type){
//      case HEADING:
//        this.widgetType="Heading";
//        break;
//      case LIST:
//        this.widgetType="List";
//        break;
//      case PARAGRAPH:
//        this.widgetType="Paragraph";
//        break;
//      case IMAGE:
//        this.widgetType="Image";
//        break;
//      case LINK:
//        this.widgetType="Link";
//        break;
//    }
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public Integer getId() {
//    return id;
//  }
//
//  public void setId(Integer id) {
//    this.id = id;
//  }
//
//  public String getWidgetType() {
//    return widgetType;
//  }
//
//  public void setWidgetType(String widgetType) {
//    this.widgetType = widgetType;
//  }
//
//  public Boolean getOrder() {
//    return order;
//  }
//
//  public void setOrder(Boolean order) {
//    this.order = order;
//  }
//
//  public String getText() {
//    return text;
//  }
//
//  public void setText(String text) {
//    this.text = text;
//  }
//
//  public String getSrc() {
//    return src;
//  }
//
//  public void setSrc(String src) {
//    this.src = src;
//  }
//
//  public Integer getSize() {
//    return size;
//  }
//
//  public void setSize(Integer size) {
//    this.size = size;
//  }
}
