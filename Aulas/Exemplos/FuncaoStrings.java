package Exemplos;


public class FuncaoStrings {
    public static void main(String[] args) {

        String original = "Ana, no verão, a brisa é tão bacana, saboreando uma banana. Ana";
        String s01 = original.toLowerCase(), s02 = original.toUpperCase(), s03 = original.trim(),
                s04 = original.substring(2), s05 = original.substring(2,9),
                s06 = original.replace("n","t"),
                s07 = original.replace("Ana","Beta");
        int i = original.indexOf("Ana"), j = original.lastIndexOf("Ana");

        String[] vect = original.split(" ");
        System.out.printf("\nOriginal: %s-",original);
        System.out.printf("\ntoLowerCase: %s-",s01);
        System.out.printf("\ntoUpperCase: %s-",s02);
        System.out.printf("\ntrim: %s-", s03);
        System.out.printf("\nsubstring (2): %s-",s04);
        System.out.printf("\nsubstring(2,9): %s-",s05);
        System.out.printf("\nreplacen a: %s-",s06);
        System.out.printf("\nreplace na ta: %s-",s07);
        System.out.printf("\nindexOf(\"Ana\"): %d-", i);
        System.out.printf("\nlastIndexOf(\"Ana\"): %d-", j);

        for(int x=0; x<vect.length;x++){
            System.out.printf("\nindex %d: %s",x,vect[x]);
        }


    }
}