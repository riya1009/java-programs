import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("getting first subject marks from user");
        int marks1 = sc.nextInt();
        System.out.println("getting second subject marks from user");
        int marks2 = sc.nextInt();
        System.out.println("getting third subject marks from user");
        int marks3 = sc.nextInt();
        System.out.println("getting fourth subject marks from user");
        int marks4 = sc.nextInt();
        System.out.println("getting fifth subject marks from user");
        int marks5 = sc.nextInt();
        System.out.println(" the sum of marks obtained");
        float sum = marks1 + marks2 + marks3 + marks4 + marks5 ;
        System.out.println(sum);
        float perc = (sum/500)*100;
        System.out.println(" the required percentage is ");
        System.out.println(perc);

        
    }
    
}
