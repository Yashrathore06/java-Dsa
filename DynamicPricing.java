import java.util.*;
public class DynamicPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base Price : ");
        int base = sc.nextInt();
        System.out.print("Demand : ");
        String demand = sc.next();
        System.out.print("Weekend : ");
        String weekend = sc.next();
        int Final_price;

        if(demand.equals("high") && (weekend.equals("yes"))){
            base += (int) (base * 0.2);
            Final_price= base +(int) (base * 0.1);
        }
        else if(demand.equals("high")){
            Final_price = base +(int) (base * 0.2);
        }
        else if(weekend.equals("yes")){
            Final_price=base+ (int) (base * 0.1);
        }else{
            Final_price=base;
        }

        System.out.println("Final Price :"+Final_price);
        sc.close();
    }
}
