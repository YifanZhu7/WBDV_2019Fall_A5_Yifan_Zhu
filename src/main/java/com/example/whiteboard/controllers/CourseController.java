package com.example.whiteboard.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CourseController {
  @GetMapping ("/api/hello")
  public String sayHello(){
    return "Hello how are you!";
  }
}