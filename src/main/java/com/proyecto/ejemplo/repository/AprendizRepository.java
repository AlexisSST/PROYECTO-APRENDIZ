
package com.proyecto.ejemplo.repository;

import com.proyecto.ejemplo.Model.Aprendiz;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz de Repositorio para la entidad Aprendiz.
 * Proporciona los métodos necesarios para realizar operaciones CRUD 
 * (Crear, Leer, Actualizar, Eliminar) en la base de datos de forma automática.
 * 
 * Al heredar de JpaRepository, no es necesario escribir código SQL para consultas básicas.
 * 
 * @author AlexisSST
 * @version 1.0
 */
public interface AprendizRepository extends JpaRepository<Aprendiz, Long> {
  
 // Al heredar de JpaRepository<Aprendiz, Long>:
    // - 'Aprendiz' indica la entidad que va a gestionar.
    // - 'Long' indica el tipo de dato de la llave primaria (@Id) de esa entidad.   
}
