import java.util.Scanner;


public class second {
    public static void main(String[] args)
    {
        
        System.out.println("taking input from users");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number 1");
        int a = sc.nextInt();
        System.out.println("enter the value of number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
    
}
