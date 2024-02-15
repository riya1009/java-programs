import java.util.Scanner;
public class reverseanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        
        System.out.println("enter elements in array");
        for (int i = 0 ; i<5 ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 4 ; i>=0 ; i--)
        {
            System.out.println(arr[i]);
            

        }
    }
    
}
