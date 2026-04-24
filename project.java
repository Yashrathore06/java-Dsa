import java.util.Scanner;
class vending_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rack, item;
        int total = 0;

        while (true) {
            System.out.println("\n--- Select Rack ---");
            System.out.println("1. Snacks");
            System.out.println("2. Drinks");
            System.out.println("3. Chocolates");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            rack = sc.nextInt();

            switch (rack) {
                case 1:
                    System.out.println("\nSnacks:");
                    System.out.println("1. Chips - ₹20");
                    System.out.println("2. Biscuits - ₹10");
                    System.out.print("Select item: ");
                    item = sc.nextInt();

                    switch (item) {
                        case 1: total += 20; break;
                        case 2: total += 10; break;
                        default: System.out.println("Invalid item!");
                    }
                    break;

                case 2:
                    System.out.println("\nDrinks:");
                    System.out.println("1. Coke - ₹30");
                    System.out.println("2. Juice - ₹25");
                    System.out.print("Select item: ");
                    item = sc.nextInt();

                    switch (item) {
                        case 1: total += 30; break;
                        case 2: total += 25; break;
                        default: System.out.println("Invalid item!");
                    }
                    break;

                case 3:
                    System.out.println("\nChocolates:");
                    System.out.println("1. Dairy Milk - ₹40");
                    System.out.println("2. KitKat - ₹35");
                    System.out.print("Select item: ");
                    item = sc.nextInt();

                    switch (item) {
                        case 1: total += 40; break;
                        case 2: total += 35; break;
                        default: System.out.println("Invalid item!");
                    }
                    break;

                case 4:
                    System.out.println("\nTotal Bill = ₹" + total);
                    System.out.println("Thank you!");
                    return; // program end

                default:
                    System.out.println("Invalid rack!");
            }
        }
    }
}
