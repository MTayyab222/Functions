import java.util.Scanner;
public class vote_eligibility {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the age to verify whether the person is eligible to cast the vote or not.");
        int age=s.nextInt();
        checking(age);

    }
    static void checking(int age){
        if(age>=18){
            System.out.println("Eligible to vote. ");
        }
        else {
            System.out.println("Not eligible to vote. ");
        }
                                }
}
