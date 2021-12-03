package com.company;

import javax.swing.*;

public class CanetaPreta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;
   public void status () {
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }

    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Da pra escrever não boy");
        } else {
            System.out.println("To rabiscano menó");
        }

    }

    private void tampar () {
        this.tampada = true;


    }

    private void destampar () {
        this.tampada = false;


    }


}

