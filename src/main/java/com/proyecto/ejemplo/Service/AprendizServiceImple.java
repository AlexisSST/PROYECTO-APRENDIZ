
package com.proyecto.ejemplo.Service;

import com.proyecto.ejemplo.Model.Aprendiz;
import com.proyecto.ejemplo.repository.AprendizRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Implementación de la interfaz AprendizService.
 * Aquí se define la lógica de negocio real de la aplicación,
 * comunicándose directamente con la capa de persistencia (Repository).
 * 
 * @author AlexisSST
 * @version 1.0
 */


@Service // Indica a Spring que esta clase es un componente de servicio
public class AprendizServiceImple implements AprendizService{
    
    @Autowired // Inyección de dependencias automática de Spring para el repositorio
    private AprendizRepository aprendizrepository;
    
    /**
     * Guarda un nuevo aprendiz utilizando el método nativo save de JPA.
     */
    @Override
    public Aprendiz newAprendiz(Aprendiz newAprendiz) { // Guarda el objeto en la base de datos y lo retorna actualizado
        return aprendizrepository.save(newAprendiz);
    }
  /**
     * Recupera todos los registros de la tabla aprendices.
     */
    @Override
    public Iterable<Aprendiz> getAll() {
        // Retorna la lista completa encontrada en la base de datos
       return this.aprendizrepository.findAll();
    }
 /**
     * Modifica los datos de un aprendiz existente.
     * Busca al usuario por su ID, si existe actualiza sus campos y guarda los cambios.
     */
    
     @Override
    public Aprendiz modifyAprendiz(Aprendiz aprendiz) {
        // Optional evita errores de puntero nulo (NullPointerException) si el ID no existe
        Optional<Aprendiz> aprendizEncontrado = this.aprendizrepository.findById(aprendiz.getIduser());
        
        // Verifica si el aprendiz realmente existe en la base de datos
        if (aprendizEncontrado.isPresent()) {
            // Extrae el objeto Aprendiz encontrado
            Aprendiz a = aprendizEncontrado.get();
            // Actualiza los valores viejos con los nuevos datos recibidos
            a.setNomuser(aprendiz.getNomuser());
            a.setApellidos(aprendiz.getApellidos());
            a.setEmail(aprendiz.getEmail());
            // Guarda los cambios aplicados en la base de datos
            return this.aprendizrepository.save(a);
        }
        return null;
        // Retorna null si el usuario no fue localizado por su ID
    }
     /**
     * Elimina de forma definitiva un aprendiz por su ID único.
     */
    
    @Override
    public Boolean deleteAprendiz(Long iduser) {
        // Llama al método de JPA para borrar el registro correspondiente al ID
        this.aprendizrepository.deleteById(iduser);
         // Confirma que el proceso se ejecutó retornando verdadero
      return  true ;
    }
    
}
