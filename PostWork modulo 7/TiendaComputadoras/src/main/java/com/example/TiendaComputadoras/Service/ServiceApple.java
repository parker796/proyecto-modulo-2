package com.example.TiendaComputadoras.Service;
import com.example.TiendaComputadoras.Repository.InterAppleRepository;
import com.example.TiendaComputadoras.model.Apple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ServiceApple implements INServApple{
    //en lugar de implementar toda la interfaz mejor hacemos una inyeccion de repositorio al servicio
    private InterAppleRepository interApple;
    private static Logger logger = LoggerFactory.getLogger(ServiceDell.class);

    @Autowired //este no es necesario
    public ServiceApple(InterAppleRepository interApple) {
        this.interApple = interApple;
    }

    @Override
    public List<Apple> obtenerApples() {
        logger.info("se obtuvo satisfactoriamente la peticion");
        return interApple.findAll();
    }
    @Override
    public List<Apple> obtenerApple(Long id) {
        //aqui era un metodo solo Dell pero se casteo
        // todo service dell por una lista porque es lo que regresa por id
        logger.info("se obtuvo satisfactoriamente la peticion");
        return (List<Apple>) interApple.findAllById(Collections.singleton(id));
    }
    @Override
    public Apple appleCrear(Apple data){ //viene un objeto json y lo convierte a una clase java
        logger.info("se obtuvo satisfactoriamente la peticion");
        return interApple.save(data);
    }
    @Override
    public Apple appleModificar(Apple data) {
        Apple updatedApple = interApple.findById(data.getId()).orElse(null);
        updatedApple.setMemoriaRam(data.getMemoriaRam());
        updatedApple.setProcesador(data.getProcesador());
        updatedApple.setDisco(data.getDisco());
        logger.info("se obtuvo satisfactoriamente la peticion");
        return interApple.save(updatedApple);
    }
    @Override
    public void appleEliminar(Long id) {
        logger.info("se obtuvo satisfactoriamente la peticion");
        interApple.deleteById(id);
    }
}
