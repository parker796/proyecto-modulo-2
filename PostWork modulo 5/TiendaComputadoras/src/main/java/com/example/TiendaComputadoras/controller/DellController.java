package com.example.TiendaComputadoras.controller;

import com.example.TiendaComputadoras.Repository.InterDell;
import com.example.TiendaComputadoras.Service.ServiceDell;
import com.example.TiendaComputadoras.model.Apple;
import com.example.TiendaComputadoras.model.Dell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@RestController
public class DellController {
    //igual lo mismo inyectamos la dependencia del servicio correspondiente
    private InterDell serviceDell;//polimorfismo cambiamos de estado en el objeto

    @Autowired //este no es necesario
    public DellController(InterDell serviceDell){
        this.serviceDell = serviceDell;
    }

    @GetMapping("/obtenerDells")
    public List<Dell> obtenerDells() {
        return serviceDell.findAll();
    }



    @GetMapping("/obtenerDell/{id}")
    public List<Dell> obtenerCurso(@PathVariable Long id) {
        //aqui era un metodo solo Dell pero se casteo
        // todo service dell por una lista porque es lo que regresa por id
            return (List<Dell>) serviceDell.findAllById(Collections.singleton(id));
    }



    @PostMapping("/dellCrear")
    public Dell dellCrear(@RequestBody Dell data){ //viene un objeto json y lo convierte a una clase java
        return serviceDell.save(data);
    }

/*
    @PutMapping("/dellModificar")
    public String dellModificar(@RequestBody Dell data){
      return serviceDell.validar();
    }

 */


    @DeleteMapping("/dellBorrar/{id}")
    public String dellEliminar(@PathVariable Long id){
        serviceDell.deleteAllByIdInBatch(Collections.singleton(id));
        return "se elimino correctamente";
    }



}
