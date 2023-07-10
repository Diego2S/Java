package Entities;

public class Student {

    public double av1,av2, av3;
    public String name;


    public double total(){

        return this.av1 + this.av2 + this.av3;
    }

    public String grade(){
        String result;

        if (total()>=60){
            result = String.format("%s\nFinal Grade = %.2f\nPASS",this.name,total());
        }else {
            result = String.format("%s\nFinal Grade = %.2f\nFAILED\nmissing %.2f",this.name,total(),Math.abs(total()-60));
        }

        return result;
    }

}
