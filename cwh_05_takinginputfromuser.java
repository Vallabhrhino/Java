package Harry;
import java.util.Scanner;

public class cwh_05_takinginputfromuser {

    public static void main(String[] args){

        System.out.println("it works");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("Sum of these numbers is: "+sum);


    }
}
