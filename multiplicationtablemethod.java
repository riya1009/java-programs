import java.util.Scanner;
public class multiplicationtablemethod {
    static void multiplicationtable(int n){
        int i = 1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of number");
        int x = sc.nextInt();
        multiplicationtable(x);
                
    }
}
