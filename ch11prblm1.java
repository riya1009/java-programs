abstract class Pen{
    abstract void refill();
    abstract void write();
}
class Fountainpen extends Pen{
    void refill(){
        System.out.println("refilling...");
    }
    void write(){
        System.out.println("hello");
        
    }
}
public class ch11prblm1 {
    public static void main(String[] args) {
        Pen p = new Fountainpen();
        p.refill();
        p.write();
    }
    
}
