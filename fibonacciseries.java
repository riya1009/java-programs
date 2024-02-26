import java.util.Scanner;
public class fibonacciseries {
    static int fibonacci(int n){
        if (n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter term");
        int x = sc.nextInt();
        int result = fibonacci(x);
        System.out.println(result);



    }
    
}
