import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int i = 1;
        int j = 10;
        while (i<=10)
        {
            System.out.println(n*i);
            i++;
        }
        while(j>=1)
        {
           System.out.println(n*j);
           j--;
        }

    }
    
}
