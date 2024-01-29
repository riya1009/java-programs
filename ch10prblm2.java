import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class Rectangle{
    float len;
    float brdth;
    Rectangle(float l , float b){
        this.len = l;
        this.brdth = b;

    }
    public float area(){
        float area = len*brdth;
        return area;
    }

}
class Cuboid extends Rectangle{
    float height;
    Cuboid(float l, float b,float h){
        super(l,b);
        this.height = h;

    }
    public float volume(){
        float volume = len*brdth*height;
        return volume;
    }
}
public class ch10prblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of length for rectangle");
        float l1 = sc.nextFloat();
        System.out.println("enter value of length for cuboid");
        float l2 = sc.nextFloat();
        System.out.println("enter value of breadth for cuboid");
        float b2 = sc.nextFloat();
        System.out.println("enter value of breadth for rectangle");
        float b1 = sc.nextFloat();
        System.out.println("enter value of height for rectangle");
        float h2 = sc.nextFloat();
        Rectangle r = new Rectangle(l1,b1);
        System.out.println("the value of area for rectangle is" + r.area());
        Cuboid c = new Cuboid(l2,b2,h2);
        System.out.println("the value of area for cuboid is" + c.area());
        System.out.println("the value of area for rectangle is" + c.volume());
    }
}
