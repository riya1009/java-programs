import java.util.Scanner;
public class marksheet{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        float physics = scan.nextFloat();
        System.out.println("Enter your English marks : ");
        float English = scan.nextFloat();
        System.out.println("Enter your Chemistry marks : ");
        float chemistry = scan.nextFloat();
        System.out.println("Enter your Mathematics marks : ");
        float mathematics = scan.nextFloat();
        System.out.println("Enter your Computer Science marks : ");
        float computer = scan.nextFloat();

        float percentage = ((physics + English + chemistry + mathematics + computer)/500)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}
    

