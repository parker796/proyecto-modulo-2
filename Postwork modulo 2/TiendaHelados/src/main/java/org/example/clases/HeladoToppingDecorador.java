package org.example.clases;

import org.example.interfaces.Helado;

public class HeladoToppingDecorador extends HeladoDecorador {
    private Helado helado;
    
    public HeladoToppingDecorador(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescri() {
        return super.getDescri() + "con topping extra";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + 20;
    }
}
