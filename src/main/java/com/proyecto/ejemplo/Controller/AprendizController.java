
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

/**
 * Controlador REST para la entidad Aprendiz.
 * Actúa como el punto de entrada de la aplicación, exponiendo los endpoints (URLs)
 * HTTP para que aplicaciones externas (como Postman o el Frontend) interactúen con el sistema.
 * 
 * @author AlexisSST
 * @version 1.0
 */

@RestController // Define esta clase como un controlador de servicios web RESTful

@RequestMapping("/aprendiz") // Ruta base de la URL para todos los endpoints de este controlador
public class AprendizController {
    
 @Autowired // Inyecta automáticamente la lógica de negocio de la capa de servicio
private AprendizService AprendizService;
 
 /**
     * Endpoint para crear un nuevo aprendiz.
     * Mapea solicitudes HTTP POST a la ruta: /aprendiz/Nuevo
     * 
     * @param aprendiz Datos del objeto JSON enviados en el cuerpo de la petición.
     * @return El objeto Aprendiz creado.
     */
  @PostMapping("/Nuevo")//Para crear un nuevo aprendiz
  public Aprendiz newAprendiz(@RequestBody Aprendiz aprendiz){
      // @RequestBody convierte el JSON que llega del cliente en un objeto Java
  return this.AprendizService.newAprendiz(aprendiz);
  
  }
  /**
     * Endpoint para obtener el listado completo de aprendices.
     * Mapea solicitudes HTTP GET a la ruta: /aprendiz/Mostrar
     * 
     * @return Colección iterable con todos los aprendices.
     */
  @GetMapping("/Mostrar")//para mostrar la informacion ingresada
  public Iterable<Aprendiz> getAll(){
      return AprendizService.getAll();
      
  }
  /**
     * Endpoint para modificar los datos de un aprendiz existente.
     * Mapea solicitudes HTTP POST a la ruta: /aprendiz/Modificar
     * 
     * @param aprendiz Datos actualizados del objeto JSON.
     * @return El objeto Aprendiz con los cambios guardados.
     */
  @PostMapping("/Modificar")
  public Aprendiz updateAprendiz(@RequestBody Aprendiz aprendiz){
  return this.AprendizService.modifyAprendiz(aprendiz);
  }
  /**
     * Endpoint para eliminar un aprendiz del sistema a través de su ID en la URL.
     * Mapea solicitudes HTTP DELETE a la ruta dinámica: /aprendiz/{id}
     * 
     * @param id Extraído directamente de la ruta de la URL.
     * @return True si el borrado fue exitoso.
     */
  @DeleteMapping(value = "/{id}")
 public Boolean deleteAprendiz(@PathVariable Long id){
      // @PathVariable asocia la variable '{id}' de la URL al parámetro 'id' del método
  return this.AprendizService.deleteAprendiz(id);
          }
  
  
}
