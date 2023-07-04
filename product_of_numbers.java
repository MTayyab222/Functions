import java.util.Scanner;
public class product_of_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers to find the product of:");
        System.out.println("Enter the number_1 : ");
        int num1=s.nextInt();
        System.out.println("Enter the number_2 : ");
        int num2=s.nextInt();
        product(num1,num2);


    }
    static void product(int num1,int num2){
        int result=num1*num2;
        System.out.println("The product is: "+result);
    }
}
