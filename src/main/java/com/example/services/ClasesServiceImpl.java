package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Clase;

/**
 * Clase donde se utiliza la interfazz ClasesServices y realiza las operaciones logicas de sus metodos
 * 
 * @see com.example.model.Clase;
 * @see com.example.services.ClasesService;
 */
@Service
public class ClasesServiceImpl implements ClasesService{

    List<Clase> clases;
    public ClasesServiceImpl() {
        clases = new ArrayList<>();
        clases.add(new Clase(111,"Java 17", 380, 500));
        clases.add(new Clase(222,"CSS", 400, 650));
        clases.add(new Clase(333,"PHP", 120, 320));
        clases.add(new Clase(444,"Windows", 150, 350));
        clases.add(new Clase(555,"Linux", 200, 400));
    }

    @Override
    public List<Clase> clases() {
        System.out.println(clases);
        return clases;
    }

    @Override
    public Clase buscarClase(int codigoClase) {
        Clase claseElegida=new Clase();
        for (Clase clase : clases) {
            if(clase.getCodigoCurso() == codigoClase){
                claseElegida=clase;
            }
        }
        return claseElegida;
    }

    @Override
    public List<Clase> eliminarClase(int codigoClase) {
        for (int i = 0; i < clases.size(); i++) {
            if (clases.get(i).getCodigoCurso() == codigoClase) {
                clases.remove(i);
            }
        }
        return clases;
    }

    @Override
    public void agregarClase(Clase clase) {
        clases.add(clase);
    }

    @Override
    public void actualizarClase(Clase clase) {
        for (Clase claseListado : clases) {
            if(claseListado.getCodigoCurso()==clase.getCodigoCurso()){
                claseListado.setNombre(clase.getNombre());
                claseListado.setDuracion(clase.getDuracion());
                claseListado.setPrecio(clase.getPrecio());
            }
        }        
    }
     
}
