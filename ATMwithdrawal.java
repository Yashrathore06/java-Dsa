public class ATMwithdrawal {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 4500;
        int mimbalance = 1000;

        if(withdrawal>balance){
            System.out.println("Transaction Failed: Insufficient balance");
        }
        else if((balance-withdrawal)<mimbalance){
            System.out.println("Transaction Failed : mimimum balance voilation");
        }
        else
        {
            System.out.println("Transaction Successful:");
            balance=balance-withdrawal;
            System.out.println("Remaining balance : "+balance );
        }
    }
}
