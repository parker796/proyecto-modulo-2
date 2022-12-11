package com.example.TiendaComputadoras.controller;

import com.example.TiendaComputadoras.model.Apple;
import com.example.TiendaComputadoras.model.CrearApple;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
/*
@RestController
public class AppleController {
    private List<Apple> apple;
    private long ultimoid = 7L;

    public AppleController() {
        apple = new LinkedList<>();
        apple.add(new Apple(5L, "chip M1", "8 GB", "256 GB state solid"));
        apple.add(new Apple(6L, "chip M1", "16 GB", "512 GB state solid"));
        apple.add(new Apple( 7L, "chip M2","16 GB", "1 TB state solid" ));
    }

    @GetMapping("/obtenerApples")
    public List<Apple> obtenerApples() {
        return apple;
    }

    @GetMapping("/obtenerApple/{id}")
    public Apple obtenerCurso(@PathVariable Long id) {
        for (Apple c : apple
        ) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @PostMapping("/appleCrear")
    public Apple appleCrear(@RequestBody Apple data){ //viene un objeto json y lo convierte a una clase java
        Apple nuevo = new Apple( ++ultimoid, data.getProcesador(), data.getMemoriaRam(), data.getDisco());
        apple.add(nuevo);
        return nuevo;
    }

    @PutMapping("/appleModificar")
    public String appleModificar(@RequestBody Apple data){
        for(int i = 0; i < apple.size(); i++) {
            Apple a = apple.get(i);
            if ( a.getId().equals(data.getId())) {
                apple.set(i, data);
                return "El valor se actualizo satisfactoriamente";
            }
        }
        return "el id que quiere modificar es incorrecto";
    }

    @DeleteMapping("/appleBorrar/{id}")
    public String appleEliminar(@PathVariable Long id){
        apple.removeIf(t -> t.getId().equals(id));
        return "El elemento se elimino satisfactoriamente";
    }



}
*/