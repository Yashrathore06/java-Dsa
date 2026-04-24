import java.util.*;

public class Electricitybill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt() ;
        double bill=50;

        if(units<=100){
            bill += 1.5*units;
        }else if(units<=200){
            bill+=1.5*100 + (units-100)*3.5;
        }else{
            bill+=1.5*100+3.5*100+(units-200)*5;
        }

        if(bill>2000){
            bill = bill *1.1;
        
        }
        System.out.println("Total bill:"+bill);
        sc.close();
    }
}