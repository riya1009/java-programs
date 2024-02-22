class A{
    public void meth1(){
        System.out.println(" i m method1 of class A");
    }
}
class B extends A{
    public void meth1(){
       System.out.println(" i m method1 in class B");
     }
}
public class methodoveriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth1();
        b.meth1();

    }
    
}
