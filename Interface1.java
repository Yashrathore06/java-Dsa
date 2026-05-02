 interface animal {
 void sound();
 default void eat(){
    System.out.println("Eating....");
}
    
}
interface Bird extends animal{

    void fly();
    default void Sleep(){
        System.out.println("Sleeping....");
    }
}
class Duck implements Bird{
    public void sound(){
        System.out.println("quack ");
    }
    public void fly(){
        System.out.println("Sparrow can fly ");
    }
}
public class Interface1 {
  public static void main(String[] args) {
    Bird a = new Duck();
    a.sound();
    a.eat();
 }   
}
