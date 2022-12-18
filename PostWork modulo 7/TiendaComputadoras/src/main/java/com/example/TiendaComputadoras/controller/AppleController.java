package com.example.TiendaComputadoras.controller;

import com.example.TiendaComputadoras.Service.INServApple;
import com.example.TiendaComputadoras.model.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Apple")
public class AppleController {
   private INServApple serviceApple;

   @Autowired
    public AppleController(INServApple serviceApple) {
      this.serviceApple = serviceApple;
    }

    //@GetMapping("/obtenerApples")
    @GetMapping
    public List<Apple> obtenerApples() {
        return serviceApple.obtenerApples();
    }

    @GetMapping("/{id}")
    public List<Apple> obtenerCurso(@PathVariable Long id) {
        return serviceApple.obtenerApple(id);
    }

   // @PostMapping("/appleCrear")
    @PostMapping
    public Apple appleCrear(@RequestBody Apple data){ //viene un objeto json y lo convierte a una clase java
        return serviceApple.appleCrear(data);
    }

   // @PutMapping("/appleModificar") //igual el id viene en el cuerpo del mensaje a actualizar
    @PutMapping
    public String appleModificar(@RequestBody Apple data){
        return "se actualizo correctamente" + serviceApple.appleModificar(data);
    }

    @DeleteMapping("/{id}")
    public String appleEliminar(@PathVariable Long id){
       serviceApple.appleEliminar(id);
       return "se elimino correctamente";
    }



}
