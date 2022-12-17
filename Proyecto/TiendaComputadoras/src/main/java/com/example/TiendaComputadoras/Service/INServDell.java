package com.example.TiendaComputadoras.Service;

import com.example.TiendaComputadoras.model.Dell;

import java.util.List;

public interface INServDell {
    public List<Dell> obtenerDells();
    public List<Dell> obtenerDell(Long id);
    public Dell dellCrear(Dell data);
    public Dell dellModificar(Dell data);
    public void deleteById(Long id);
}
