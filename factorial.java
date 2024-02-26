import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int product = 1;
        int i = 1;
        while (i<=n)
        {
            product = product * i;
            i++;

        }
        System.out.println(product);
    }
    
}
