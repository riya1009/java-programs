import java.util.Scanner;
public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total marks");
        float total = sc.nextFloat();
        System.out.println("enter marks of subject 1");
        float subject1 = sc.nextFloat();
        System.out.println("enter marks of subject 2");
        float subject2 = sc.nextFloat();
        System.out.println("enter marks of subject 3");
        float subject3 = sc.nextFloat();
        float sum = subject1 + subject2 + subject3; 
        float perc1 = (subject1/total)*100;
        float perc2 = (subject2/total)*100;
        float perc3 = (subject3/total)*100;
        float perctotal = (sum/(3*total))*100;
        //System.out.println(sum + " " + perc1 + perc2 + perc3 + perctotal);
        if ( perc1 > 33 && perc2 > 33 && perc3 > 33 && perctotal > 40)
        {
            System.out.println("you are passed");

        }
        else{
            System.out.println("you are failed");
        }

    }
    
}
