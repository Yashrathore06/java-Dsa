class Student {
    private int rollno;
   private String name;
    private int age;
    private String section;

    Student(int r,String name,int age,String sec){
        this.rollno=r;
        this.name=name;
        this.age=age;
        this.section=sec;
    }
    private void study(){
        System.out.println("Dont Disturb me ...I am learning OOPS");
    }
    private void sleep(){
        System.out.println("Sleeping ......");
    }

    public int getRollNO(){
        return this.rollno;
    }
    public void setRollNO(int r){
        this.rollno=r;
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return this.age;
    }
    public void setage(int age){
        this.age=age;
    }

    public String getsec(){
        return this.section;
    }
    public void setSec(String sec){
        this.section=sec;
    }
    public void callstudy(){
        this.study();
    }
    public void callsleep(){
        this.sleep();
    }
}
public class Encap1 {
    public static void main(String[] args) {
        
    
    Student s= new Student(123,"yash",20,"A");
    System.out.println(s.getage());
s.setage(22);
System.out.println(s.getage());
   s.callsleep();

    }
}
