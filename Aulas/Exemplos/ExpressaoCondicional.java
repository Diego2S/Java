package Exemplos;

public class ExpressaoCondicional {
    public static void main(String[] args) {


        System.out.println((2>4) ? 50:80);
        System.out.println((10!=3) ? "Maria":"Alex");
        System.out.println((8 == 4*2)? true: false);

        double preco = 34.5,desconto;
        desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

        preco = 345;

        desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

    }
}