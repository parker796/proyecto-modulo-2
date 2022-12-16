package com.example.TiendaComputadoras.Service;

import com.example.TiendaComputadoras.model.Apple;

import java.util.List;

public interface INServApple {
    public List<Apple> obtenerApples();
    public List<Apple> obtenerApple(Long id);
    public Apple appleCrear(Apple data);
    public Apple appleModificar(Apple data);
    public void appleEliminar(Long id);
}
