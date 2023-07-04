import java.util.Scanner;
    public class Area {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Write a program to print the circumference and area of a circle of radius
        double radi;
        System.out.println("Enter the radius: ");
        radi=s.nextDouble();
        circumference(radi);
        Area_of_circle(radi);
    }
    static void circumference(double radius ){
        double result=2*Math.PI*radius;
        System.out.println("The circumference of the circle is: "+result);
    }
    static void Area_of_circle(double radius){
        double res=Math.PI*Math.pow(radius,2);
        System.out.println("The area of the circle is: "+res);
    }
}
