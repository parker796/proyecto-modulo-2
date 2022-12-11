package com.example.TiendaComputadoras.model;


import jakarta.persistence.*;

//estas clases son las que vamos a utilizar en base de datos
@Entity
@Table(name = "Apple")
public class Apple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "procesador", nullable = false, length = 50)
    private String procesador;
    @Column(name = "memoria ram", nullable = false, length = 20)
    private String memoriaRam;
    @Column(name = "disco duro", nullable = false, length = 50)
    private String disco;

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
