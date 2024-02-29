abstract class Monkey{
    abstract void jump();
    abstract void bite();

}
interface Basicanimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements Basicanimal{
    void jump(){
        System.out.println("humans jump");
    }
    void bite(){
        System.out.println("humans do not bite");
    }
    public void eat(){
        System.out.println("humans eat fast food");
    }
    public void sleep(){
        System.out.println("humans sleep for 8 hours");
    }
}
public class ch11prblm2 {
    public static void main(String[] args) {
        Monkey m = new Human();
        Basicanimal b = new Human();
        m.bite();
        b.eat();
    }
}
