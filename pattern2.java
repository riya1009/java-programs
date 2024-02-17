import java.util.Scanner;
public class pattern2 {
    static void pattern(int n){
        int i ,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int x = sc.nextInt();
        pattern(x);
    }
    
}
