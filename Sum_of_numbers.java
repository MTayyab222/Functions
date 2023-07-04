import java.util.Scanner;
public class Sum_of_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number_1 : ");
        int num1=s.nextInt();
        System.out.println("Enter the number_2 : ");
        int num2=s.nextInt();
        sum(num1, num2);

    }
    //creating method:
    static void sum(int num1,int num2){
        int sum1=num1+num2;
        System.out.println("The sum of the given numbers is: "+sum1);
    }
}
