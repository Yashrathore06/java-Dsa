interface A {
    public static final int rollno =5;
    void show();

    default void Present(){
        System.out.println("Inside A");
    }
    
}
interface B {

    
    default void PresentB(){
        System.out.println("Inside B");
    }
}
class C1 implements A,B{
    public void show(){
        System.out.println("showing..");
    }
}
    

public class Interface2 {
    public static void main(String[] args) {
       C1 c= new C1();
        c.show();
    }
}
