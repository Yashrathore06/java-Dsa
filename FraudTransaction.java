
import java.util.Scanner;
public class FraudTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount : ");
        int Amount=sc.nextInt();
        System.out.print("LocationMatch : ");
        String locMatch=sc.next();
        System.out.print("Transactions : ");
        int trans=sc.nextInt();

        if(((Amount>50000) && (locMatch.equalsIgnoreCase("no")))  || (trans>=3) ){
            System.out.println("Transaction successful");
        }else{
            System.out.println("Fraud Detected");
        }
        sc.close();
    }
}
