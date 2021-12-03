package com.company;

public class Calculadora {
    int botões;
    boolean display;
    int pilhas;
    void status () {
        System.out.println("Esta calculadora tem quantos botões? " + this.botões);
        System.out.println("O display está ligado? " + this.display);
        System.out.println("Carga das pilhas: " + this.pilhas);

    }
    void calcular() {
        if(this.display == true) {
            System.out.println("Pode calcular");
        } else {
            System.out.println("ERRO, A CALCULADORA ESTÁ DESLIGADA");

        }

    }



}
