interface camera {
    void snap();
    default void smile(){
        System.out.println("smiling");
    }

}

interface music{
    void playmusic();
    default void record(){
        System.out.println("recording");
    }
}
abstract class cellphone{
    abstract void call();
    public void receive(){
        System.out.println("reciveing number");
    }

}
class Smartphone extends cellphone implements music , camera{
    void call(){
        System.out.println("calling");
    }
    public void playmusic(){
        System.out.println("playing music");
    }
    public void snap(){
        System.out.println("taking snap");
    }
}

public class defaultmethods {
    public static void main(String[] args) {
       Smartphone s = new Smartphone();
       s.call();
       s.playmusic();
       s.snap();
       s.smile();
       s.record();
       s.receive(); 
    }

}
