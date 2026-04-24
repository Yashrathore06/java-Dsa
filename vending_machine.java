import java.util.Scanner;

public class vending_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        char stay;

        do {
            System.out.println("tray 1 | Snacks ");
            System.out.println("tray 2 | beverages ");
            System.out.println("tray 3 | Sweets ");
            System.out.println("choose your tray | 1 | 2 | 3 |0(exit)");
            int tray = sc.nextInt();

            switch(tray){
                case 1:
                    {System.out.println("you have chosen tray 1 which includes : ");
                    do {
                        System.out.println("1 : Lays - Rs30");
                        System.out.println("2 : Pringles - Rs60");
                        System.out.println("3 : turture - Rs50");

                        int product_no = sc.nextInt();
                        if(product_no == 1) total += 30;
                        else if(product_no == 2) total += 60;
                        else if(product_no == 3) total += 50;

                        System.out.println("stay on this tray press y / exit this tray press n");
                        stay = sc.next().charAt(0);
                    } while(stay != n);}
                    break;

                case 2:{System.out.println("you have chosen tray 2 which includes : ");
                    do {
                        System.out.println("1 : diet coke - Rs30");
                        System.out.println("2 : Ultra kingfisher beer - Rs60");
                        System.out.println("3 : Blenders pride - Rs50");

                        int product_no = sc.nextInt();
                        if(product_no == 1) total += 30;
                        else if(product_no == 2) total += 60;
                        else if(product_no == 3) total += 50;

                        System.out.println("stay on this tray press y / exit this tray press n");
                         stay = sc.next().charAt(0);
                        } while(stay != n);}
                    break;

                case 3:{System.out.println("you have chosen tray 3 which includes : ");
                    do {
                        System.out.println("1 : Rasgulla | Rs30");
                        System.out.println("2 : ice cream | Rs60");
                        System.out.println("3 : Cake | Rs50");

                        int product_no = sc.nextInt();
                        if(product_no == 1) total += 30;
                        else if(product_no == 2) total += 60;
                        else if(product_no == 3) total += 50;

                       System.out.println("stay on this tray press y / exit this tray press n");
                        stay = sc.next().charAt(0);
                    } while(stay != n);}
                    break;
            }

        } while(tray != 0);

        System.out.println("Total bill = Rs" + total);
    }
}
