package com.company;

import javax.swing.*;

public class CanetaPreta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status () {
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }

    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Da pra escrever não boy");
        } else {
            System.out.println("To rabiscano menó");
        }

    }

    void tampar () {
        this.tampada = true;


    }

    void destampar () {
        this.tampada = false;


    }


}

