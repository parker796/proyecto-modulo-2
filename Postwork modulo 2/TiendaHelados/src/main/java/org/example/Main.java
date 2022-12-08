package org.example;
import org.example.clases.*;
import org.example.interfaces.Helado;
public class Main {
    public static void main(String[] args) {
        Helado heladosuave = new HeladoSuave();
        heladosuave = new HeladoCoberturaDecorador(heladosuave);
        System.out.println(heladosuave.getDescri() + " " + "$" + heladosuave.getPrecio());
        heladosuave = new HeladoGranolaDecorador(heladosuave);
        System.out.println(heladosuave.getDescri() + " " + "$" + heladosuave.getPrecio());
        heladosuave = new HeladoToppingDecorador(heladosuave);
        System.out.println(heladosuave.getDescri() + " " + "$" + heladosuave.getPrecio());
        heladosuave = new HeladoMermeladaDecorador(heladosuave);
        System.out.println(heladosuave.getDescri() + " " + "$" + heladosuave.getPrecio());
        heladosuave = new HeladoGalletaDecorador(heladosuave);
        System.out.println(heladosuave.getDescri() + " " + "$" + heladosuave.getPrecio());

    }
}