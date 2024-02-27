class Phone{
    public void showTime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turning on phone...");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("turning on smartphone...");
    }
}
public class dynamicmethoddispatching {
    public static void main(String[] args) {
        Phone p = new Smartphone();
        p.showTime();
        p.on();
         
    }
}
