package Exemplos;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int soma = 0;
        int x = sc.nextInt();

        while (x !=0){
            soma += x;
            System.out.print("Digite um numero: ");
            x = sc.nextInt();
        }
        System.out.printf("A soma dos valores e %d ",soma);


        System.out.print("\ndigite a senha de saida:");
        int senha = sc.nextInt();
        while (senha != 2002){
            System.out.println("Senha Incorreta!!");
            System.out.print("\ndigite a senha de saida:");
            senha = sc.nextInt();
        }


        boolean loop = true;
        int alc = 0, gas = 0, die = 0;
        while (loop) {
            System.out.println(" 1.Álcool 2.Gasolina \n3.Diesel " +
                    "4.Fim");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    alc++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    die++;
                    break;
                case 4:
                    System.out.println("Muito obrigado!!!");
                    loop = false;
                    break;
                default:
                    System.out.println("Opcao invalida!!");
            }
        }
        System.out.println("Alcool: " + alc);
        System.out.println("Gas: " + gas);
        System.out.println("Diesel: " + die);
        System.out.println("Fim do programa");

        sc.close();
    }
}