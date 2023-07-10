package Entities;

public class Rectangle {
    public double width,height;

    public double area(){
        return this.height * this.width;}

    public double perimeter(){
        return 2 * this.height + 2 * this.width;
    }

    public double diagonal(){
        return Math.sqrt(2 * this.height + 2 * this.width);
    }

    public String toString(){
        return "\nArea = " + String.format("%.2f",area())+
                "\nPerimeter = " + String.format("%.2f",perimeter())+
                "\nDiagonal = " + String.format("%.2f",diagonal());
    }

}
