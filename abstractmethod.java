abstract class Parent{
    public Parent(){
        System.out.println("i m a constructor of parent");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract void greet1();
    abstract void greet2();
}
class Child extends Parent{
    public void greet1(){
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good afternoon");
    }
    public Child(){
        System.out.println("i m a constructor of base");
    }
}

public class abstractmethod {
    public static void main(String[] args) {
        
    
    Child c = new Child();
    c.sayhello();
    c.greet2();
    c.greet1();
    
    }
    
}
