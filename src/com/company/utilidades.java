package com.company;

public class utilidades {

    public void clearScreen(){
        try {
            System.out.println("\033\143");
            Runtime.getRuntime().exec("clear");
        }catch (Exception e){
            System.out.println("Error al borrar la pantalla: "+e.getMessage());
        }
    }

    public  boolean esEntradaNoNumerica(String entrada){
        boolean respuesta = false;
        if(entrada.equals("+") || entrada.equals("-")||entrada.equals("*")||entrada.equals("/")||entrada.equals("%"))
            respuesta = true;
        return respuesta;
    }

}
