

public class Main {
    public static void main(String[] args) {

        int ver[] = new int[]{20,20,20,40,30};
        int i;
        double soma=0;
        i=1;
        while (i<=4){
            soma= soma + ver[i];
            i++;
        }
        System.out.println(soma/i+1);

    }
}