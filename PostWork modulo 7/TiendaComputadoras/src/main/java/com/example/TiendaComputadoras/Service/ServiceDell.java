package com.example.TiendaComputadoras.Service;

import com.example.TiendaComputadoras.Repository.InterDellRepository;
import com.example.TiendaComputadoras.model.Dell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;


@Service
public class ServiceDell implements INServDell{
    //en lugar de implementar toda la interfaz mejor hacemos una inyeccion de repositorio al servicio
    private InterDellRepository interDell;

    private static Logger logger = LoggerFactory.getLogger(ServiceDell.class);
    @Autowired //este no es necesario
    public ServiceDell(InterDellRepository interDell) {
        this.interDell = interDell;
    }

    @Override
    public List<Dell> obtenerDells() {
        logger.info("se obtuvo satisfactoriamente la peticion");
        return interDell.findAll();
    }

    @Override
    public List<Dell> obtenerDell(Long id) {
        //aqui era un metodo solo Dell pero se casteo
        // todo service dell por una lista porque es lo que regresa por id
        logger.info("se obtuvo satisfactoriamente la peticion");
        return (List<Dell>) interDell.findAllById(Collections.singleton(id));
    }
    @Override
    public Dell dellCrear(Dell data){ //viene un objeto json y lo convierte a una clase java
        logger.info("se obtuvo satisfactoriamente la peticion");
        return interDell.save(data);
    }
    @Override
    public Dell dellModificar(Dell data) {
        Dell updatedDell = interDell.findById(data.getId()).orElse(null);
        updatedDell.setMemoriaRam(data.getMemoriaRam());
        updatedDell.setProcesador(data.getProcesador());
        updatedDell.setDisco(data.getDisco());
        logger.info("se obtuvo satisfactoriamente la peticion");
        return interDell.save(updatedDell);
    }
    @Override
    public void deleteById(Long id) {
        logger.info("se obtuvo satisfactoriamente la peticion");
        interDell.deleteById(id);
    }


}
