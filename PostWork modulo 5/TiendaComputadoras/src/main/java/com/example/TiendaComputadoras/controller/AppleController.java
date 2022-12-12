package com.example.TiendaComputadoras.controller;

import com.example.TiendaComputadoras.Service.ServiceApple;
import com.example.TiendaComputadoras.model.Apple;
import com.example.TiendaComputadoras.model.CrearApple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class AppleController {
   private ServiceApple serviceApple;

   @Autowired
    public AppleController(ServiceApple serviceApple) {
      this.serviceApple = serviceApple;
    }

    @GetMapping("/obtenerApples")
    public List<Apple> obtenerApples() {
        return serviceApple.obtenerApples();
    }

    @GetMapping("/obtenerApple/{id}")
    public List<Apple> obtenerCurso(@PathVariable Long id) {
        return serviceApple.obtenerApple(id);
    }

    @PostMapping("/appleCrear")
    public Apple appleCrear(@RequestBody Apple data){ //viene un objeto json y lo convierte a una clase java
        return serviceApple.appleCrear(data);
    }

    @PutMapping("/appleModificar")
    public String appleModificar(@RequestBody Apple data){
        return "se actualizo correctamente" + serviceApple.appleModificar(data);
    }

    @DeleteMapping("/appleBorrar/{id}")
    public String appleEliminar(@PathVariable Long id){
       serviceApple.appleEliminar(id);
       return "se elimino correctamente";
    }



}
