package Exemplos;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dia;
        int op;
        System.out.println("Dias da semana: ");
        op = sc.nextInt();

        switch (op){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "dia invalido";
                break;
        }

        System.out.printf("o dia escolhido foi %s", dia);


    }
}