
 
class EkClass{ 
int a; 
public int getA() { 
return a; 
} 
EkClass()
{
    System.out.println("hello");
}
EkClass(int x){ 
    a = x;
    System.out.println(a);
 } 
public int returnone(){
 return 1; 
} 
} 
class DoClass extends EkClass{
 DoClass(int c){ 
    super(c); 
    System.out.println("I am a constructor"); } 
} 
public class thisandsuper { 
public static void main(String[] args) {
EkClass e = new EkClass(); 
EkClass f = new EkClass(65);
DoClass d = new DoClass(5); 
System.out.println(e.getA());
//System.out.println(d.getA());


} 


}
