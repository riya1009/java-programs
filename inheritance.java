class Base{
    int x;
    public int getx()
        {
            return x;
        }
    
    public void setx(int a){
        this.x = a;
    }


}
class Derived extends Base{
    int y;
    public int gety()
        {
            return y;
        }
    
    public void sety(int a){
        this.y = a;
    }

}
public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.setx(4);
        System.out.println(b.getx());
        d.sety(5);
        System.out.println(d.gety());
        d.setx(6);
        System.out.println(d.getx());


    }
    
}
