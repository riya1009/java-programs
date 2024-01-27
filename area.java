import java.util.Scanner;

public class area{
    public static void main(String[] agrs)
    {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);


    }
}