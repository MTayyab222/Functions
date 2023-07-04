import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        //Define a program to find out whether a given number is even or odd
        System.out.println("Enter the number to find whether it is even or odd:");
        Scanner s=new Scanner(System.in);
        int num;
        num=s.nextInt();
        Even_odd(num);
    }
    static void Even_odd(int num){
        if(num%2==0){
            System.out.println(num+" is even: ");
        }
        if (num%2==1){
            System.out.println(num+" is odd: ");
        }
                                 }
}
