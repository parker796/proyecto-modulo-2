package com.example.TiendaComputadoras.controller;

import com.example.TiendaComputadoras.model.Apple;
import com.example.TiendaComputadoras.model.Dell;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class DellController {
    private List<Dell> dell;
    private long ultimoid = 7L;

    public DellController() {
        dell = new LinkedList<>();
        dell.add(new Dell(5L, "i5", "8 GB", "256 GB state solid"));
        dell.add(new Dell(6L, "i7", "16 GB", "512 GB state solid"));
        dell.add(new Dell( 7L, "i9","16 GB", "1 TB state solid" ));
    }

    @GetMapping("/obtenerDells")
    public List<Dell> obtenerDells() {
        return dell;
    }

    @GetMapping("/obtenerDell/{id}")
    public Dell obtenerCurso(@PathVariable Long id) {
        for (Dell c : dell
        ) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @PostMapping("/dellCrear")
    public Dell dellCrear(@RequestBody Dell data){ //viene un objeto json y lo convierte a una clase java
        Dell nuevo = new Dell( ++ultimoid, data.getProcesador(), data.getMemoriaRam(), data.getDisco());
        dell.add(nuevo);
        return nuevo;
    }

    @PutMapping("/dellModificar")
    public String dellModificar(@RequestBody Dell data){
        for(int i = 0; i < dell.size(); i++) {
            Dell a = dell.get(i);
            if ( a.getId().equals(data.getId())) {
                dell.set(i, data);
                return "El valor se actualizo satisfactoriamente";
            }
        }
        return "el id que quiere modificar es incorrecto";
    }

    @DeleteMapping("/dellBorrar/{id}")
    public String dellEliminar(@PathVariable Long id){
        dell.removeIf(t -> t.getId().equals(id));
        return "El elemento se elimino satisfactoriamente";
    }



}
