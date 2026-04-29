import java.util.*;
public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seats : ");
        int Seats = sc.nextInt();
    
        if(Seats>0){
            System.out.println("Ticket Confirmed");
        }else{
            System.out.print("VIP : ");
             String VIP=sc.next();
            if(VIP.equals("yes")){
                System.out.println("Ticket Confirmed");
            }else{
            System.out.println("Waitlist");
            }
        }
        sc.close();
    }
}
