
import Entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;


public class MainVecClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoas[] pessoa = new Pessoas[n];
        double somaAltura=0;
        int pessoasMenor16=0;

        for (int i =0; i<n;i++){
            pessoa[i] = new Pessoas();
            System.out.println("Digite os dados da pessoa");
            System.out.print("Digite o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();
            pessoa[i].setNome(nome);
            pessoa[i].setIdade(idade);
            pessoa[i].setAltura(altura);
            somaAltura += altura;

            pessoasMenor16 = (idade<16) ? pessoasMenor16 +1 : pessoasMenor16;


        }


        System.out.printf("Media de altura: %.2f", (somaAltura/n));

        System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n", ((double)pessoasMenor16/n*100));

        for (int i =0;i<n;i++){
            if(pessoa[i].getIdade()< 16){
                System.out.println(pessoa[i].getNome());
            }
        }




        sc.close();
    }
}
