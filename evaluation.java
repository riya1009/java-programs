import java.util.Scanner;
public class evaluation{
    public static void main(String[] args){
        System.out.println("taking input from user");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        int result = a+b-c;
        System.out.println(result);

    }
}
