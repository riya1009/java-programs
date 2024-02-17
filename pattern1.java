import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows upto which u want to print the pattern");
        int n = sc.nextInt();
        for (int i = 1; i<=n ; i++)
        {
            for (int j = n ; j>=i ; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}