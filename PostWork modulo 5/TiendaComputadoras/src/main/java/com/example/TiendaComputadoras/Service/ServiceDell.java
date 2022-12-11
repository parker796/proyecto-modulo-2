package com.example.TiendaComputadoras.Service;

import com.example.TiendaComputadoras.Repository.InterDell;
import com.example.TiendaComputadoras.model.Dell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class ServiceDell implements  InterDell {
    //en lugar de implementar toda la interfaz mejor hacemos una inyeccion de repositorio al servicio
    private InterDell interDell;

    @Autowired //este no es necesario
    public ServiceDell(InterDell interDell) {
        this.interDell = interDell;
    }

/*
    @Override
    public Dell validar() {
        return interDell.validar().;
    }
    //hacemos la validacion del update
        Optional<Dell> equipodell = interDell.findById(data.getId());
        if (equipodell.isPresent()) {
            Dell dell = equipodell.get();
            dell.setDisco(data.getDisco());
            dell.setProcesador(data.getProcesador());
            dell.setMemoriaRam(data.getMemoriaRam());
            interDell.save(dell);
            return "Se actualizo correctamente el registro";
        } else {
            return "Error en el articulo que desea modificar";
        }
    }*/
}
