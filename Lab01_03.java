import java.util.Scanner;
public class Lab01_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialBalance, air, newBalance = 0;
        int years;
        System.out.print("Please enter the initial balance: ");
        initialBalance = input.nextDouble();
        System.out.print("Please enter the annual interest rate: ");
        air = input.nextDouble();
        System.out.print("Please enter the umber of years the client wants to save the money in the bank: ");
        years = input.nextInt();
        newBalance = initialBalance + (initialBalance * (air/100));
        for(int i = 0; i < years - 1; i++){
            newBalance = (newBalance * (1 + (air/100)));
        }
        System.out.println("");
        System.out.printf("Initial Balance          :%10.2f\n", initialBalance);
        System.out.printf("Annual Interest Rate     :%9.2f%s\n", air, "%");
        System.out.printf("Saving Years             :%10d\n", years);
        System.out.println("------------------------------");
        System.out.printf("Balance After %d Years    :%10.2f", years, newBalance);
    }
}
