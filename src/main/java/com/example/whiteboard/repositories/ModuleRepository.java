package com.example.whiteboard.repositories;

import com.example.whiteboard.model.Module;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ModuleRepository
    extends CrudRepository<Module, Integer> {

  @Query("select module from Module module where module.id=moduleId")
  public Module findModuleById(@Param("moduleId") Integer id);

  @Query("select module from Module module")
  public List<Module> findAllModules();
}
