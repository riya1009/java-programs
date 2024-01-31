import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        System.out.println("getting input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("getting first input from user");
        int a = sc.nextInt();
        System.out.println("getting second input from user");
        int b = sc.nextInt();
        System.out.println("getting third input from user");
        int c = sc.nextInt();
        int result = a+b+c;
        System.out.println(" the sum of three number is");
        System.out.println(result);


        
    }
    
}
