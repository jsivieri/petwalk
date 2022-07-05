package com.br.petwalk.model;

public enum Sexo {
    MACHO(0), FEMEA(1);

    public int valorSexo;
    Sexo(int valor){
        valorSexo = valor;
    }

    public int getValor(){
        return valorSexo;
    }
}
