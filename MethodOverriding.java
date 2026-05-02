class A{
    void add(int a,int b){
        System.out.println("total from A class :"+(a+b));
    }
}
class B extends A{
    void add(int a,int b){
            super.add(a, b);
             System.out.println("total from B class:"+(a+b));
        }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.add(10,20);
    }
}
