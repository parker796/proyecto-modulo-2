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
        if(interApple.findAll().size()>0){
            logger.info("Tenemos elementos en la BD de datos");
             return interApple.findAll();}
        else{
            logger.warn("No tenemos elementos en la BD hay que agregar");
            return null;
        }
    }
    @Override
    public List<Apple> obtenerApple(Long id) {
        //aqui era un metodo solo Dell pero se casteo
        // todo service dell por una lista porque es lo que regresa por id
        if(interApple.findAllById(Collections.singleton(id)).size()>0){
            logger.info("Si encontramos el elemento");
             return (List<Apple>) interApple.findAllById(Collections.singleton(id));}
        else{
            logger.warn("No se encontro el elemento");
            return null;
        }
    }
    @Override
    public Apple appleCrear(Apple data){ //viene un objeto json y lo convierte a una clase java
        logger.info("se creo el elemento");
        return interApple.save(data);
    }
    @Override
    public Apple appleModificar(Apple data) {
        Apple updatedApple = interApple.findById(data.getId()).orElse(null);
        if(interApple.findById(data.getId()).isEmpty() == true) {
            logger.warn("Elemento que deseas modificar ya no existe");
            return null;
        }else {
            updatedApple.setMemoriaRam(data.getMemoriaRam());
            updatedApple.setProcesador(data.getProcesador());
            updatedApple.setDisco(data.getDisco());
            logger.info("se actualizo correctamente");
            return interApple.save(updatedApple);
        }
    }
    @Override
    public void appleEliminar(Long id) {
        if(interApple.findAllById(Collections.singleton(id)).size()>0) {
            logger.info("Se elimino correctamente");
            interApple.deleteById(id);
        }else{
            logger.warn("No se encontro el elemento a eliminar");
        }
    }
}
