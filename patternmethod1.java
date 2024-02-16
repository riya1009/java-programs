import java.util.Scanner;
public class patternmethod1 {
    static void patternmethod(int n){
        for (int i = 1 ; i <=n ; i++){
            for (int j = 1 ; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows to be printed");
        int x = sc.nextInt();
        patternmethod(x);
    }

}
