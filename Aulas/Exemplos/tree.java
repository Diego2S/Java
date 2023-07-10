package Exemplos;


public class tree {
    public static void main(String[] args) {

        int a=17,b=0;

        while (a > 0 && b < 16) {

            a -= 1;
            b += 2;
            int espacosAntes = (16 - b) / 2;

            for (int i = 0; i < espacosAntes; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < b; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int j=0;j<2;j++) {
            int espacosAntes = 7;
            for (int i = 0; i < espacosAntes; i++) {
                System.out.print(" ");
                if (i == 6) {
                    System.out.print("||\n");
                }
            }
        }

        System.out.print("     \\====/");
    }
}

