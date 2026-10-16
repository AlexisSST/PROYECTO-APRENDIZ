
package com.proyecto.ejemplo.Controller;

import com.proyecto.ejemplo.Model.Aprendiz;
import com.proyecto.ejemplo.Service.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/aprendiz")
public class AprendizController {
 @Autowired
private AprendizService AprendizService;
  @PostMapping("/Nuevo")//Para crear un nuevo aprendiz
  public Aprendiz newAprendiz(@RequestBody Aprendiz aprendiz){
  return this.AprendizService.newAprendiz(aprendiz);
  
  }
  @GetMapping("/Mostrar")//para mostrar la informacion ingresada
  public Iterable<Aprendiz> getAll(){
      return AprendizService.getAll();
      
  }
  @PostMapping("/Modificar")
  public Aprendiz updateAprendiz(@RequestBody Aprendiz aprendiz){
  return this.AprendizService.modifyAprendiz(aprendiz);
  }
  @DeleteMapping(value = "/{id}")
 public Boolean deleteAprendiz(@PathVariable Long id){
  return this.AprendizService.deleteAprendiz(id);
          }
  
  
}
