import java.util.*;
public class OnlineCheatingSys {
    static void cheatingDetection(int tab_switch,int Idle_time){

        if(tab_switch>3 || Idle_time>5){
            System.out.println("Cheating Suspected ");
        }else{
            System.out.println("Cheating not Suspected ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tab switch : ");
        int tab_switch=sc.nextInt();
        System.out.print("Idle time : ");
        int Idle_time=sc.nextInt();
        cheatingDetection(tab_switch,Idle_time);
        sc.close();
    }
}
