import java.util.*;
public class warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of products :");
        int n = sc .nextInt();
        int total=0;
        for(int i=1;i<=n;i++){
            int curr = sc.nextInt();
            int minreq=sc.nextInt();
            if(curr<minreq){
                System.out.println("Restock needed for product "+i);
                total++;
            }

        }
        System.out.println("Total no of products need to be restock"+total);
    }
}
