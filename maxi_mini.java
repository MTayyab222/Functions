import java.util.Scanner;
public class maxi_mini {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//Define two methods to print the maximum and the minimum number respectively among three numbers.
        maxi(2,3,4);
        mini(2,3,4);
    }
    static void mini(int x,int y, int z){
        if(x<y && x<z)
            System.out.println("minimum number is: "+x);
        else if (y<x && y<z) {
            System.out.println("minimum number is: "+y);
        }
        else if(z<x && z<y) {
            System.out.println("minimum number is: "+z);
    }
                                         }



        static void maxi(int a, int b,int c){
        if(a>b && a>c){
            System.out.println("maximum number is: "+a);
        }

        else if (b>a && b>c) {
            System.out.println("maximum number is: "+b);
        }
        else if(c>a && c>b) {
            System.out.println("maximum number is: "+c);
        }
                                           }
}
