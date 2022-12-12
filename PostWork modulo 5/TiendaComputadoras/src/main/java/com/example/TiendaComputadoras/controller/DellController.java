package com.example.TiendaComputadoras.controller;

import com.example.TiendaComputadoras.Service.ServiceDell;
import com.example.TiendaComputadoras.model.Dell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@RestController
public class DellController {
    //igual lo mismo inyectamos la dependencia del servicio correspondiente
    private ServiceDell serviceDell;//polimorfismo cambiamos de estado en el objeto

    @Autowired //este no es necesario
    public DellController(ServiceDell serviceDell){
        this.serviceDell = serviceDell;
    }

    @GetMapping("/obtenerDells")
    public List<Dell> obtenerDells() {
        return serviceDell.obtenerDells();
    }
    @GetMapping("/obtenerDell/{id}")
    public List<Dell> obtenerDell(@PathVariable Long id) {
        return serviceDell.obtenerDell(id);
    }
    @PostMapping("/dellCrear")
    public Dell dellCrear(@RequestBody Dell data){ //viene un objeto json y lo convierte a una clase java
        return serviceDell.dellCrear(data);
    }
    @PutMapping("/dellModificar")
    public String dellModificar(@RequestBody Dell data){
      return "actualizado correctamente " + serviceDell.dellModificar(data);
    }
    @DeleteMapping("/dellBorrar/{id}")
    public String dellEliminar(@PathVariable Long id){
        serviceDell.deleteById(id);
        return "se elimino correctamente ";
    }



}
