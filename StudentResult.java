
import java.util.*;
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n=5;
        boolean fail = false;
        System.out.print("Enter marks");
        for(int i=1; i<=n; i++){
            int marks = sc.nextInt();

            if(marks<33){
                fail= true;
                break;
            }else {
                sum += marks;
            }
        }

        if (fail){
            System.out.println("fail");
        }else{
        int avg = sum/ n;

            if(avg>=75){
                System.out.println("Distinction ");
            }else if(avg>=60){
                System.out.println("First Division ");
            }else if(avg>=50){
                System.out.println("Second Division");
            }else {
                System.out.println("Pass");
            }
        }
        sc.close();

    }
}
