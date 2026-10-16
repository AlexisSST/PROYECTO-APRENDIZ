
package com.proyecto.ejemplo.Service;

import com.proyecto.ejemplo.Model.Aprendiz;


public interface AprendizService {

    Aprendiz newAprendiz (Aprendiz newAprendiz);
    Iterable<Aprendiz> getAll(); //Hacer el recorrido y sacar todos los datos
    Aprendiz modifyAprendiz (Aprendiz aprendiz);
    Boolean deleteAprendiz (Long iduser );

}
