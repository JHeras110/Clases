package com.example.services;

import com.example.model.Clase;
import java.util.List;

/**
 * Interfaz que implemtena a ClasesServicesImpl
 * 
 * @see com.example.model.Clase;
 * @see com.example.services.ClasesServiceImpl;
 */
public interface ClasesService {
    List<Clase> clases();
    Clase buscarClase(int codigoLibro);
    void agregarClase(Clase clase);
    void actualizarClase(Clase clase);
    List<Clase> eliminarClase(int codigoLibro);

}


