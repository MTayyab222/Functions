import java.util.Scanner;
public class Finding_factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int num=s.nextInt();
        factorial(num);
    }
    static void factorial(int num){
        int facto=1;
        for(int i=1;i<=num;i++){
            facto=facto*i;
        }
        System.out.println("The factorial is: "+facto);
    }
}
