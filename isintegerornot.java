import java.util.Scanner;
public class isintegerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be check");
        
        boolean check = sc.hasNextInt();
        System.out.println(check);
        if (check == true){
            System.out.println("entered number is integer");
        }
        else{
            System.out.println("entered number is not a integer");
        }
    }
}

    

