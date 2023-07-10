
import java.util.Scanner;

public class ExercicioFinalMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();


      int[][] matriz = new int[linha][coluna];

      for (int i=0;i<matriz.length;i++ ){
          for(int j =0;j<matriz[i].length;j++){

              matriz[i][j] = sc.nextInt();

          }
      }
        System.out.print("busca numero:");
        int busca = sc.nextInt();

        for (int i =0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j] == busca) {
                    System.out.printf("Posicao %d, %d\n",i,j);
                    if(i>0){
                        System.out.println("up " +  matriz[i - 1][j] );}
                    if (j > 0) {
                        System.out.println("left " + matriz[i][j - 1]);
                    }
                    if(j < matriz[i].length-1) {
                        System.out.println("right " + matriz[i][j + 1]);
                    }
                    if(i< matriz.length-1){
                        System.out.println("down " + matriz[i + 1][j]);
                    }
                }
            }
        }



    }


}
