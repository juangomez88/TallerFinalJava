package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float memoria = 0;
        Scanner leer = new Scanner(System.in);
        utilidades util = new utilidades();
        String entrada = "";
        String nuevaEntrada ="";

        do {
            System.out.println(memoria);
            entrada = leer.nextLine();
            if(entrada.equals("+")){
                util.clearScreen();
                nuevaEntrada = leer.nextLine();
                if(util.esEntradaNoNumerica(nuevaEntrada)){
                    System.out.println("expresion no ingresada correctamente");
                }else{
                    memoria+=Float.valueOf(nuevaEntrada);
                    util.clearScreen();
                }
            }
            else if(entrada.equals("-")){
                util.clearScreen();
                nuevaEntrada = leer.nextLine();
                if(util.esEntradaNoNumerica(nuevaEntrada)){
                    System.out.println("expresion no ingresada correctamente");
                }
                else {
                    memoria -= Float.valueOf(leer.nextLine());
                    util.clearScreen();
                }
            }
            else if(entrada.equals("*")){
                util.clearScreen();
                nuevaEntrada= leer.nextLine();
                if(util.esEntradaNoNumerica(nuevaEntrada)){
                    System.out.println("expresion no ingresada correctamente");
                }
                else{
                    memoria*=Float.valueOf(leer.nextLine());
                }
            }
            else if (entrada.equals("/")){
                util.clearScreen();
                nuevaEntrada = leer.nextLine();
                if(util.esEntradaNoNumerica(nuevaEntrada)){
                    System.out.println("Expresion no ingresad correctamente");
                }else {
                    memoria/=Float.valueOf(leer.nextLine());
                    util.clearScreen();
                }
            }
            else if(entrada.equals("%")){
                util.clearScreen();
                nuevaEntrada=leer.nextLine();
                if(util.esEntradaNoNumerica(nuevaEntrada)){
                    System.out.println("Expresion mal formada");
                }
                else{
                    memoria=memoria%Float.valueOf(leer.nextLine());
                    util.clearScreen();
                }
            }
            else {
                util.clearScreen();
                memoria=Float.valueOf(entrada);
            }

        }while(!entrada.equals("="));
    }
}