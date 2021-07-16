package com.maniakapps.mexicanspeak;

public class Frase implements Frases {
    private String texto;

    public Frase() {
    }


    Frase(String texto) {
        this.texto = texto;
    }


    @Override
    public String toString() {
        return "Frase{" +
                "texto='" + texto + '\'' +
                '}';
    }

    @Override
    public void setFrase(String texto) {
        this.texto = texto;
    }

    @Override
    public String getFrase() {
        return this.texto;
    }
}
