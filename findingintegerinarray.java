import java.util.Scanner;
public class findingintegerinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer to be found in array");
        int n = sc.nextInt();
        int flag = 0;
        int [] arr = new int[5];
        int sum = 0;
        System.out.println("enter elements in array");
        for (int i = 0 ; i<5 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i<5 ; i++)
        {
            if (n==arr[i])
            {
                flag = 1;
                break;
            }
        }
        if (flag==1)
        {
            System.out.println("integer is found in array");

        }
        else{
            System.out.println("integer is not found in array");
        }
        
        
    }
    
}
