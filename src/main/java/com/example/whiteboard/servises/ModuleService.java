package com.example.whiteboard.servises;

import com.example.whiteboard.model.Module;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
//public class ModuleService {
//  Module Module1 = new Module(1, "module1");
//  Module Module2 = new Module(2, "module2");
//  Module Module3 = new Module(3, "module3");
//
////  Course[] Courses = {Course1,Course2,Course3};
//
//  List<Module> modules = new ArrayList<Module>();
//  {
//    modules.add(Module1);
//    modules.add(Module2);
//    modules.add(Module3);
//
//
//  }
//
//  @PostMapping("/api/modules")
//  public Module createModule(
//      @RequestBody Module module){
//    if(!modules.contains(module)) {
//      modules.add(module);
//    }
//    return module;
//  }
//
//  @DeleteMapping("/api/modules/{inputId}")
//  public void deleteModule(
//      @PathVariable("inputId") Integer id){
//    for(Module module:modules){
//      if(module.getId().equals(id)){
//        modules.remove(module);
//      }
//    }
//    return;
//  }
//
//  @PutMapping("/api/modules/{inputId}")
//  public Module updateModule(
//      @PathVariable("inputId") Integer id,
//      @RequestBody Module newModule){
//    for(Module module:modules){
//      if(module.getId().equals(id)){
//        module.setTitle(newModule.getTitle());
//        return module;
//      }
//    }
//    return null;
//  }
//
//  @GetMapping("/api/modules")
//  public List<Module> findAllCourse(){
//    return modules;
//  }
//
//  @GetMapping("/api/courses/{inputId}")
//  public Module findModuleById(
//      @PathVariable("inputId") Integer id){
//    for(Module module:modules){
//      if(module.getId().equals(id)){
//        return module;
//      }
//    }
//    return null;
//  }
//}
