import java.util.Scanner;
public class sumofmarksarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];
        int sum = 0;
        System.out.println("enter elements in array");
        for (int i = 0 ; i<5 ; i++)
        {
            marks[i] = sc.nextInt();
        }
        for (int element : marks)
        {
            System.out.println(element);
            sum = sum + element;

        }
        System.out.println(sum);
    }
    
}
