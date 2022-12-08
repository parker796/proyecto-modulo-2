package org.example.clases;

import org.example.interfaces.Helado;

public class HeladoGranolaDecorador extends HeladoDecorador {

    private Helado helado;

    public HeladoGranolaDecorador(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescri() {
        return super.getDescri() + "con granola extra";
    }
    @Override
    public double getPrecio() {
        return helado.getPrecio() + 10;
    }
}
