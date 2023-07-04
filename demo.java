import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num2;
        int check = 0;
        System.out.println("Enter the number: ");
        num2 = s.nextInt();
        for (int i = 1; i <= num2; i++) {
            if ((num2 % i == 0)) {
                check++;
            }

        }
        if (check == 2) {
            System.out.println(num2 + " is prime:");
        } else if (check != 2) {
            System.out.println(num2 + " is composite:");
        } else {
            System.out.println("1");
        }

    }
}
