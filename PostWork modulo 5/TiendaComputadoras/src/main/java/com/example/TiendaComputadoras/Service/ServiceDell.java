package com.example.TiendaComputadoras.Service;

import com.example.TiendaComputadoras.Repository.InterDellRepository;
import com.example.TiendaComputadoras.model.Dell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceDell{
    //en lugar de implementar toda la interfaz mejor hacemos una inyeccion de repositorio al servicio
    private InterDellRepository interDell;
    @Autowired //este no es necesario
    public ServiceDell(InterDellRepository interDell) {
        this.interDell = interDell;
    }

    public List<Dell> obtenerDells() {
        return interDell.findAll();
    }

    public List<Dell> obtenerDell(Long id) {
        //aqui era un metodo solo Dell pero se casteo
        // todo service dell por una lista porque es lo que regresa por id
        return (List<Dell>) interDell.findAllById(Collections.singleton(id));
    }

    public Dell dellCrear(Dell data){ //viene un objeto json y lo convierte a una clase java
        return interDell.save(data);
    }
    public Dell dellModificar(Dell data) {
        Dell updatedDell = interDell.findById(data.getId()).orElse(null);
        updatedDell.setMemoriaRam(data.getMemoriaRam());
        updatedDell.setProcesador(data.getProcesador());
        updatedDell.setDisco(data.getDisco());
        return interDell.save(updatedDell);
    }

    public void deleteById(Long id) {
        interDell.deleteById(id);
    }


}
