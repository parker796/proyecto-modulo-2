package org.example.clases;
import org.example.interfaces.Helado;

public class HeladoGalletaDecorador extends HeladoDecorador{
    private Helado helado;

    public HeladoGalletaDecorador(Helado helado){
        this.helado = helado;
    }
    @Override
    public String getDescri() {
        return super.getDescri() + "con galleta extra";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + 15;
    }
}
