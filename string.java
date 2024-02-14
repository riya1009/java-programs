import  java.util.Scanner;
public class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String name = sc.next();
        
        
        for ( int i = 0 ; i<name.length();i++)
        {
            if (name.charAt(i)=='*')
            {
                continue;
            }
            else{
                System.out.print(name.charAt(i));
            }
            
        }

    }

     
}
