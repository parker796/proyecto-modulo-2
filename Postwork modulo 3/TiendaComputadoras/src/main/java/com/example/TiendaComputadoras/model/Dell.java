package com.example.TiendaComputadoras.model;



//estas clases son las que vamos a utilizar en base de datos
public class Dell {
    private Long id;
    private String procesador;
    private String memoriaRam;
    private String disco;

    public Dell(Long id,String procesador, String memoriaRam, String disco){
        this.id = id;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.disco = disco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Long getId() {
        return id;
    }

    public String getDisco() {
        return disco;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }
}
