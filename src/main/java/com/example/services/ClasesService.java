package com.example.services;

import com.example.model.Clase;
import java.util.List;

public interface ClasesService {
    List<Clase> clases();
    Clase buscarClase(int codigoLibro);
    void agregarClase(Clase clase);
    void actualizarClase(Clase clase);
    List<Clase> eliminarClase(int codigoLibro);

}
