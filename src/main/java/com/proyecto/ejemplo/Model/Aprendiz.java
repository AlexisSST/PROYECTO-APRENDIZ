
package com.proyecto.ejemplo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Entidad que representa a un Aprendiz en la base de datos.
 * Mapea los datos de la tabla correspondiente.
 * 
 * @author AlexisSST
 * @version 1.0
 */

@Entity
@Data

// Reemplaza por el nombre real de tu tabla si aplica
public class Aprendiz {
    
     // Identificador único de la entidad (Llave primaria)
    @Id
    @Column
    private Long iduser;
    
     // Nombre de usuario del aprendiz
    @Column (name ="Nombres", nullable = false,length = 20)
    private String nomuser;
    
    
    // Apellidos completos del aprendiz
     @Column (name ="Apellidos", nullable = false,length = 25)
    private String apellidos;
     
      // Correo electrónico de contacto
     @Column (name ="email", unique = true, nullable = false)
    private String email;

     /**
     * Obtiene el ID del usuario.
     * @return Long con el ID del usuario.
     */
    public Long getIduser() {
        return iduser;
    }

     /**
     * Asigna o actualiza el ID del usuario.
     * @param iduser El nuevo ID a asignar.
     */
    
    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnomuser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getapellidos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getemail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
