import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int sum = 0;
        System.out.println("enter elements in array");
        for (int i = 0 ; i<5 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i<5 ; i++)
        {
            System.out.println(arr[i]);
            sum = sum + arr[i];

        }
        System.out.println(sum);
        
    }
    
}
