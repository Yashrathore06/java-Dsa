import java.util.Scanner;

public class trafficFineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("speed :");
        int speed = sc.nextInt();
         sc.nextLine();
        int fine=0;

        if (speed>100){
             fine = 1000;
        }
         else if(speed>80){
            fine =500;
        }

        System.out.print("repeated :");

        String repeated = sc.nextLine();
        if(repeated.equals("yes" )){
            fine = fine*2;
            
        }
        System.out.println("fine :"+fine);
        sc.close();
    }



}
