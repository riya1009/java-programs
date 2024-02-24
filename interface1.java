interface Bicycle{
    void applybrake();
    void speedup();
}
interface Horn{
    void blowhorn();
    void showlight();
}
class Avon implements Bicycle , Horn{
    public void applybrake()
    {
        System.out.println("stop...");
    }
    public void speedup(){
        System.out.println("speeding up...");
    }
    public void blowhorn(){
        System.out.println("pee pee pee");
    }
    public void showlight(){
        System.out.println("showing lights...");
    }
    
}

public class interface1 {
    public static void main(String[] args) {
        Avon a = new Avon();
        Bicycle b = new Avon();
        Horn h = new Avon();
        a.applybrake();
        b.speedup();
        h.blowhorn();
        a.showlight();
    }
    
}
