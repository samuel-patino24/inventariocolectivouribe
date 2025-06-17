package org.example.samuelp;

public class samuelp {
        private static final String ANSI_BLUE = "\u001B[34m";
        public static void main(String[] args) {
            System.out.println("hello world!");
            String ANSI_BLUE = "\u001B[34m";
            //1. proceso --> menu de opciones
            Integer opcion=0;
            System.out.println( ANSI_BLUE + "************");
            System.out.println("grupo uribe ");
            System.out.println("************");

            System.out.println("\n1- CREAR");
            System.out.println("2- READ");
            System.out.println("3- MODIFICAR");
            System.out.println("4- DELETE");
            System.out.println("5- SALIR");

        }
    }


