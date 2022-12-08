package org.example.clases;

import org.example.interfaces.Helado;

public class HeladoSuave implements Helado {
    @Override
    public String getDescri() {
        return "Helado suave";
    }

    @Override
    public double getPrecio() {
        return 30;
    }
}
