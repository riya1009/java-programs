import java.util.Scanner;
public class sumofevennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum = sum +i;
            }
            i++;
        }
        System.out.println(sum);

    }
}
