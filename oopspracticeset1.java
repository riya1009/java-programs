import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
     Employee(int s){
        salary = s;

    }

}
public class oopspracticeset1 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of salary");
        int salary = sc.nextInt();
        Employee object1 = new Employee(salary);
        System.out.println(object1.getsalary());
        object1.setname("riya");
        System.out.println(object1.getname());
    
    }
    
}
