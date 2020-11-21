package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);

        int expression = r.nextInt();


        switch(expression) {
            case 2:
            case 4:
                System.out.println("Valor Par");
                break;
            case 3:
            case 1:
                System.out.println("Valor Impar");
                break;
            default:
                System.out.println("0 o 5");

        }


        char expressio = r.next().charAt(0);


        switch(expressio) {
            case 'i':
            case 'e':
                System.out.println("Vocales cerradas");
                break;
            case 'u':
            case 'o':
                System.out.println("Vocales abiertas");
                break;
            default:
                System.out.println("letra a");

        }
    }
}
