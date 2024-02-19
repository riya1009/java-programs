import java.util.Scanner;
class Employee{
    int id;
    int salary;
    String name;
    public void setid(int n)
    {
        id = n;
    }
    public int getid()
    {
        return id;
    }
    public void setsalary(int a)
    {
        salary = a;
    }
    public int getsalary()
    {
        return salary;
    }
    public void setname(String x)
    {
        name = x;
    }
    public String getname()
    {
        return name;
    }
}



public class oops1 {
    public static void main(String[] args) {
        Employee object1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of id for object1");
        int id = sc.nextInt();
        System.out.println("enter value of salary for object1");
        int salary = sc.nextInt();
        System.out.println("enter value of name for object1");
        String name = sc.next();
        object1.setid(id);
        object1.setsalary(salary);
        object1.setname(name);
        System.out.println(object1.getid());
        System.out.println(object1.getsalary());
        System.out.println(object1.getname());





    }
}