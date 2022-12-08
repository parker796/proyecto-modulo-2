package org.example.clases;

import org.example.interfaces.Helado;

public class HeladoCoberturaDecorador extends HeladoDecorador {

    private Helado helado;
    public HeladoCoberturaDecorador(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescri() {
        return super.getDescri() + "con cobertura extra";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + 20;
    }
}
