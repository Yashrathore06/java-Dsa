import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount=");
        double Amount=sc.nextInt();
        sc.nextLine();
        System.out.print("Premium=");
        String Premium = sc.next();
        int discount =0;
        if(Amount>=5000){
            discount=20;
        }else if (Amount>=3000){
            discount =10;
        }else{
            discount=0;
        }

        if(Premium.equals("yes")){
            discount+=5;
        }

        Double FinalAmount = Amount -(Amount*discount/100);
        System.out.println("Final Amount ="+FinalAmount);
        sc.close();
    }
}
