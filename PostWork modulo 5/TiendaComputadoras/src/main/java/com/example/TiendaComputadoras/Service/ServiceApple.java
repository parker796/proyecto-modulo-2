package com.example.TiendaComputadoras.Service;
import com.example.TiendaComputadoras.Repository.InterAppleRepository;
import com.example.TiendaComputadoras.model.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ServiceApple {
    //en lugar de implementar toda la interfaz mejor hacemos una inyeccion de repositorio al servicio
    private InterAppleRepository interApple;
    @Autowired //este no es necesario
    public ServiceApple(InterAppleRepository interApple) {
        this.interApple = interApple;
    }

    public List<Apple> obtenerApples() {
        return interApple.findAll();
    }

    public List<Apple> obtenerApple(Long id) {
        //aqui era un metodo solo Dell pero se casteo
        // todo service dell por una lista porque es lo que regresa por id
        return (List<Apple>) interApple.findAllById(Collections.singleton(id));
    }

    public Apple appleCrear(Apple data){ //viene un objeto json y lo convierte a una clase java
        return interApple.save(data);
    }
    public Apple appleModificar(Apple data) {
        Apple updatedApple = interApple.findById(data.getId()).orElse(null);
        updatedApple.setMemoriaRam(data.getMemoriaRam());
        updatedApple.setProcesador(data.getProcesador());
        updatedApple.setDisco(data.getDisco());
        return interApple.save(updatedApple);
    }

    public void appleEliminar(Long id) {
        interApple.deleteById(id);
    }
}
