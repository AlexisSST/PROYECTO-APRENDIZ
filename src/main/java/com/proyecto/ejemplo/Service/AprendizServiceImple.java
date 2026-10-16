
package com.proyecto.ejemplo.Service;

import com.proyecto.ejemplo.Model.Aprendiz;
import com.proyecto.ejemplo.repository.AprendizRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AprendizServiceImple implements AprendizService{
    
    @Autowired
    private AprendizRepository aprendizrepository;
    
    @Override
    public Aprendiz newAprendiz(Aprendiz newAprendiz) {
        return aprendizrepository.save(newAprendiz);
    }

    @Override
    public Iterable<Aprendiz> getAll() {
       return this.aprendizrepository.findAll();
    }

     @Override
    public Aprendiz modifyAprendiz(Aprendiz aprendiz) {
        Optional<Aprendiz> aprendizEncontrado = this.aprendizrepository.findById(aprendiz.getIduser());
        if (aprendizEncontrado.isPresent()) {
            Aprendiz a = aprendizEncontrado.get();
            a.setNomuser(aprendiz.getNomuser());
            a.setApellidos(aprendiz.getApellidos());
            a.setEmail(aprendiz.getEmail());
            return this.aprendizrepository.save(a);
        }
        return null;
    }
    
    
    @Override
    public Boolean deleteAprendiz(Long iduser) {
        this.aprendizrepository.deleteById(iduser);
      return  true ;
    }
    
}
