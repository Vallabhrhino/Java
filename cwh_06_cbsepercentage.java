package Harry;
import java.util.Scanner;
public class cwh_06_cbsepercentage {

    public static void main(String[] args){

        System.out.println("CBSE PERCENTAGE CALCULATOR");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name");
        String s = sc.nextLine();


        System.out.println("Enter marks for subject A");
        int a = sc.nextInt();
        System.out.println("Enter marks for subject B");
        int b = sc.nextInt();
        System.out.println("Enter marks for subject C");
        int c = sc.nextInt();
        System.out.println("Enter marks for subject D");
        int d = sc.nextInt();
        System.out.println("Enter marks for subject E");
        int e = sc.nextInt();

        float sum = a+b+c+d+e;
        float k = sum/500;

        float percentage = (k)*100;

        System.out.println("Sum of these numbers is: "+sum);
        System.out.println("Perecentage = "+percentage);


    }


}
