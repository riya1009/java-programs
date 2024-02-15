import java.util.Scanner;
public class recursivesum {
    static int sum(int x){
        if (x==1){
            return 1;
        }
        else{
            return x + sum(x-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int summation = sum(n);
        System.out.println(summation);
    }
    
}
