import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Even=0;
        int Odd=0;

        while(true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num%2==0){
                Even++;
            }else{
               Odd++; 
            }
        }
        System.out.println("Even:"+Even);
        System.out.println("Odd:"+Odd);
        sc.close();
    }
}
