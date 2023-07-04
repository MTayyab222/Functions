import java.util.Scanner;
public class Prime_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number :");
        int num=s.nextInt();
        prime_checking(num);

    }
    static void prime_checking(int num){

        int check = 0;
              for (int i = 1; i <= num; i++) {
            if ((num % i == 0)) {
                check++;
            }

        }
        if (check == 2) {
            System.out.println(num + " is prime:");
        } else if (check != 2) {
            System.out.println(num + " is not prime:");
        } else {
            System.out.println("1");
        }

    }
                           }
