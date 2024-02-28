class A{
    


}
class B extends A{
    B(){

        
        System.out.println("i m a constructor of derived");
    }
}
public class constructorchecking {
    public static void main(String[] args) {
        B b1 = new B();
    }
    
}
