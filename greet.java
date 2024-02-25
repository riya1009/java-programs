import java.util.Scanner;
public class greet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next();
        
        System.out.printf("hello %s , have a great day ahead",name);
    }
}
