
package com.portfolio.fdh.Interface;

import com.portfolio.fdh.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer lista persona
    public List<Persona> getPersona();
    
    //Guardar Objeto Persona
    
    public void savePersona(Persona persona);
    
    //Eliminar Objeto buscando por ID
    
    public void deletePersona(Long id);
    
    //Buscar persona x ID
    
    public Persona findPersona(Long id);
    
}
