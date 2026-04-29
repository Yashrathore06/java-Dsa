import java.util.*;
public class CabFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance : ");
        int Distance = sc.nextInt();
        System.out.print("Night :");
        String Night = sc.next();
        int Fare=0;
        if(Distance<=5){
            Fare = Distance*50;
        }else if(Distance<=10){
            Fare = 5*50 + (Distance-5)*40;
        }else{
            Fare = 5*50 + 5*40 + (Distance-10)*30;
        }

        if(Night.equals("yes")){
            Fare += (int) (Fare*0.2);
        }
        System.out.println("Fare :"+Fare);
        sc.close();
    }
}
