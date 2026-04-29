import java.util.*;
public class ReturnPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Days : ");
        int days = sc.nextInt();

        System.out.print("Defective : ");
        String defective = sc.next();

        System.out.print("Premium : ");
        String premium = sc.next();

        if(days<=7 || defective.equalsIgnoreCase("yes") || 
        (premium.equalsIgnoreCase("yes") && days<=15) ){
            System.out.println("Return Accepted ");
        }else 
        {
            System.out.println("Return Rejected ");
        }
        sc.close();
    }
}
