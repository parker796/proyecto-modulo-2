package org.example.clases;

import org.example.interfaces.Helado;

public class HeladoMermeladaDecorador extends HeladoDecorador {
    private Helado helado;

    public HeladoMermeladaDecorador(Helado helado){
        this.helado = helado;
    }
    @Override
    public String getDescri() {
        return super.getDescri() + "con mermelada extra";
    }
    @Override
    public double getPrecio() {
        return helado.getPrecio() + 10;
    }
}
