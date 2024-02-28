import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        int givennumber = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        if (number > givennumber)
        {
            System.out.println("entered number is greater");

        }
        else{
            System.out.println("entered number is s smaller");
        }

    }
    
}
