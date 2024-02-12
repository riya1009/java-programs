abstract class Phone{  
  abstract void on();  
}  
class SmartPhone extends Phone{  
void on(){
System.out.println("Turning on...");
} 
}
public class abstractclass1{ 
public static void main(String args[]){  
 Phone obj = new SmartPhone();  
 obj.on();  
}  
}  