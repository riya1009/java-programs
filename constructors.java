class Cylinder{
    float radius;
    float height;
    public void setradius( float r){
        radius = r;
    }
    public void setheight(float h){
        height = h;
    }
    public float getheight(){
        return height;

    }
    public float getradius(){
        return radius;
    }
    Cylinder(){}
    Cylinder(float r1){
        radius = r1;
    }
    Cylinder(float r1 , float h1)
    {
        radius = r1;
        height = h1;
    }
}
public class constructors {
    public static void main(String[] args) {
        
    
    Cylinder c1 = new Cylinder();
    c1.setradius(3.0f);
    c1.setheight(3f);
    System.out.println(c1.getheight());
    System.out.println(c1.getradius());
    Cylinder c2 = new Cylinder(3f);
    Cylinder c3 = new Cylinder(3f,4f);
    System.out.println(c2.getradius());
    System.out.println(c3.getheight());
    System.out.println(c3.getradius());



    }
}
