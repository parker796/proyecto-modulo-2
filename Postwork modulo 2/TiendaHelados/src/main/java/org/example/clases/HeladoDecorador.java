package org.example.clases;

import org.example.interfaces.Helado;

public abstract class HeladoDecorador implements Helado {
    @Override
    public String getDescri() {
        return "ingredientes de los helados: ";
    }
}
