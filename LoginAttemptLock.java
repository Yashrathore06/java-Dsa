import java.util.Scanner;

public class LoginAttemptLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Correctpassword ="yash123";
        int attempts=0;
        boolean success=false;

        while (attempts<3){
            System.out.print("Enter password:");
            String pass = sc.nextLine();

            if(pass.equals(Correctpassword)){
                System.out.println("correct password:");
                success=true;
                break;
            }else{
                System.out.println("wrong");
                attempts++;
            }

        }
        if(!success){
            System.out.println("Account Locked");
        }
        sc.close();
    }
}
