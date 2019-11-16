package com.example.whiteboard.controllers;

import com.example.whiteboard.controllers.WidgetController;
import com.example.whiteboard.model.Module;
import com.example.whiteboard.model.Widget;
import com.example.whiteboard.model.Widget.type;
import com.example.whiteboard.repositories.CourseRepository;
import com.example.whiteboard.repositories.ModuleRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import java.lang.management.LockInfo;
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
public class ModuleController {

  @Autowired
  ModuleRepository repository;

//  Module Module1 = new Module(1, "module1");
//  Module Module2 = new Module(2, "module2");
//  Module Module3 = new Module(3, "module3");




//  Course[] Courses = {Course1,Course2,Course3,Course4,Course5};

//  List<Module> Modules = new ArrayList<Module>();
//
//  {
//    Modules.add(Module1);
//    Modules.add(Module2);
//    Modules.add(Module3);
//  }

  @PostMapping("/api/modules")
  public List<Module> createModule(
      @RequestBody Module module) {
    repository.save(module);
    return findAllModule();
//    if (!Modules.contains(module)) {
//      Modules.add(module);
//    }
//    return module;
  }

  @DeleteMapping("/api/modules/{inputId}")
  public void deleteModule(
      @PathVariable("inputId") Integer id) {
    repository.deleteById(id);
//    for (Module module : Modules) {
//      if (module.getId().equals(id)) {
//        Modules.remove(module);
//      }
//    }
//    return;
  }

  @PutMapping("/api/modules/{inputId}")
  public List<Module> updateModule(
      @PathVariable("inputId") Integer id,
      @RequestBody Module newModule) {
    repository.save(newModule);
    return repository.findAllModules();
//    for (Module module : Modules) {
//      if (module.getId().equals(id)) {
//        module.setTitle(newModule.getTitle());
//        return module;
//      }
//    }
//    return null;
  }

  @GetMapping("/api/modules")
  public List<Module> findAllModule() {
    return repository.findAllModules();
//    return (List<Module>) repository.findAll();
  }

  @GetMapping("/api/modules/{inputId}")
  public Module findModuleById(
      @PathVariable("inputId") Integer id) {
    return repository.findModuleById(id);

//    Optional<Module> c = repository.findById(id);
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
