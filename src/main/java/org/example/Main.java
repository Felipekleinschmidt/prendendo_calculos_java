package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        //Seção do layout do menu
        System.out.println("-----------------------------------------");
        System.out.println("|         programa de resolução         |");
        System.out.println("|              de cálculos              |");
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de calculos");
        System.out.println("Escolhas a opção desejada");
        System.out.println("1 Conversor de moedas");
        System.out.println("2 Conversor de medidas");
        System.out.println("3 Conversor de temperatura");
        //Lê a entrada do teclado do usúario
        System.out.print("Opção: ");
        menu = scanner.nextInt();

        //execução do menu do nivel correto

        switch(menu){
            case 1:
               System.out.println("Entrou no conversor de moedas");
               break;
            case 2:
                System.out.println("Entrou no conversor de medidas");
                break;
            case 3:
                System.out.println("Entrou no conversor de temperatura");
                break;
            default:
                System.out.println("Opção Invalida");
                break;

        }

return;










        //execução do menu no nivel complicado
       // if (menu == 1) {
            //verficar se nao digitou o valor 1 para o menu
            //System.out.println("Entrou no conversor de moeda");
        //} else {
            //se nao digitou o valor 1, executa isso
           // if (menu == 2) {
                //verficar se nao digitou o valor 2 para o menu
                //System.out.println("Entrou no coversor de medidas");
          //  } else {
                //se nao digitou o valor 2, executa isso
               // if (menu == 3) {
                    //verficar se nao digitou o valor 3 para o menu
                    //System.out.println("Entrou no coversor de temperaturas");
               // } else {
                    //se nao digitou o valor 3, executa isso
                    //System.out.println("Opção Invalida");
               // }
            //}
      // }
    }
}