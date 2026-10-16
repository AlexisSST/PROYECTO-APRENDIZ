
package com.proyecto.ejemplo.Service;

import com.proyecto.ejemplo.Model.Aprendiz;
/**
 * Interfaz de Servicio para la gestión de Aprendices.
 * Define el contrato de los métodos de lógica de negocio que deben ser 
 * implementados obligatoriamente para interactuar con la entidad Aprendiz.
 * 
 * @author AlexisSST
 * @version 1.0
 */

public interface AprendizService {

    /**
     * Registra o guarda un nuevo aprendiz en el sistema.
     * @param newAprendiz Objeto con los datos del aprendiz a registrar.
     * @return El objeto Aprendiz ya guardado (incluye el ID asignado).
     */
    
    Aprendiz newAprendiz (Aprendiz newAprendiz);
    /**
     * Obtiene la lista completa de todos los aprendices registrados.
     * Hace el recorrido y extrae todos los datos de la base de datos.
     * @return Una colección iterable con todos los objetos Aprendiz.
     */
    
    Iterable<Aprendiz> getAll(); //Hacer el recorrido y sacar todos los datos
     /**
     * Modifica o actualiza los datos de un aprendiz existente.
     * @param aprendiz Objeto con los datos actualizados del aprendiz.
     * @return El objeto Aprendiz con los cambios aplicados.
     */
    
    Aprendiz modifyAprendiz (Aprendiz aprendiz);
     /**
     * Elimina a un aprendiz del sistema a partir de su identificador único.
     * @param iduser El ID del aprendiz que se desea eliminar.
     * @return Verdadero (true) si se eliminó con éxito, falso (false) en caso contrario.
     */
    Boolean deleteAprendiz (Long iduser );

     
}
