class Base{
    Base()
    {
       System.out.println("i m a constructor in base");
    }
    Base(int a){
        System.out.println(a);
    }
}
class Derived extends Base{
    Derived(){
        super(4);
        System.out.println(" i m constructor in derived");
    }
    Derived(int b , int c){
        super(4);
        System.out.println(b + " " + c);
    }
    


}
class Childofderived extends Derived{
    Childofderived()
    {
        super(5,6);
        System.out.println(" i m a constructor in child of derived");
    }

}
public class constructorsininheritance {
    public static void main(String[] args) {
        //Base b = new Base();
        Derived d = new Derived();
        //Childofderived c = new Childofderived(); 
    }
}
