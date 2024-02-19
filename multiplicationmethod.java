import java.util.Scanner;
public class multiplicationmethod {
    static int multiplier(int x , int y)
    {
        int z;
        z = x*y;
        return z;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b ");
        int b = sc.nextInt();
        int c = multiplier(a,b);
        System.out.println(c);
        System.out.println(multiplier(a,b));
        
    }
    
}
