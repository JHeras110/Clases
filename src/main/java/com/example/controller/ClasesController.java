package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Clase;
import com.example.services.ClasesService;

@RestController
public class ClasesController {
    
    @Autowired
    ClasesService service;

    @GetMapping(value = "clases", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clase> Clases(){
        return service.clases();
    }

    @GetMapping(value = "clase/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Clase clase(@PathVariable("codigo") int clase){
        return service.buscarClase(clase);
    }

    @PostMapping(value = "clase", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregar(@RequestBody Clase clase){
        service.agregarClase(clase);
    }

    @PutMapping(value="clase", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Clase clase){
        service.actualizarClase(clase);
    }

    @DeleteMapping(value="clase/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clase> eliminar(@PathVariable("codigo")int codigoClase){
        return service.eliminarClase(codigoClase);
    }
}
