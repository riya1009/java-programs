import java.util.Scanner;
public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter salary");
        float salary = sc.nextFloat();
        if ( salary > 250000f && salary < 500000f)
        {
            float tax = (0.05f)*salary;
            System.out.println("tax given on income is" + " " + tax);

        }
        else if ( salary > 500000f && salary < 1000000f)
        {
            float tax = 0.2f*salary;
            System.out.println("tax given on income is" + " " + tax);
        }
        else if ( salary > 1000000f)
        {
            float tax = (0.3f)*salary;
            System.out.println("tax given on income is" + " " + tax);

        }

        
    }
    
}
