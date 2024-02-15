class Square{

    int side;
    int area;
    int perimeter;
    public void setSide(int s){
        side = s;
    }
    public int getperimeter(){
        perimeter = 4*side;
        return perimeter;
    }
    public int getarea(){
        area = side*side;
        return area;
    }
}
class Rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    public void setlength(int l){
        length = l;
    }
    public void setbreadth(int b){
        breadth = b;
    }
    public int getperimeter(){
        perimeter = 2*(length + breadth);
        return perimeter;
    }
    public int getarea(){
        area = length * breadth;
        return area;
    }
}
class Circle{
    
    float radius;
    float area;
    float perimeter;
    public void setradius(int r){
        radius = r;
    }
    public float getperimeter(){
        perimeter = 2*3.14f*radius;
        return perimeter;
    }
    public float getarea(){
        area = 3.14f*radius*radius;
        return area;
    }
}


public class squareoops {
    
public static void main(String[] args) {
    Square sq1 = new Square();
    sq1.setSide(5);
    System.out.println(sq1.getarea());
    System.out.println(sq1.getperimeter());
    Rectangle rg1 = new Rectangle();
    rg1.setlength(3);
    rg1.setbreadth(2);
    System.out.println(rg1.getarea());
    System.out.println(rg1.getperimeter());
    Circle c1 = new Circle();
    c1.setradius(7);
    System.out.println(c1.getarea());
    System.out.println(c1.getperimeter());






}

}
