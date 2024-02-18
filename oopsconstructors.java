import java.util.Scanner;
class Employee{
    int id ;
    int salary;
    String name;
    public Employee(int x , int y){
        id = x;
        salary= y;
    }
    public int getid()
    {
        return id;
    }
    public int getsalary(){
        return salary;
    }
}

public class oopsconstructors {
    public static void main(String[] args) {
        
    
        Employee object1 = new Employee(12,12000);
        System.out.println(object1.getid());
        System.out.println(object1.getsalary());

    }
    
}
