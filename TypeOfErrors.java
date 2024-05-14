import java.util.Scanner;
public class TypeOfErrors {
    public static void main(String[] args) {
        final double FEDERAL_TAX = 0.1, RC = 0.1, SST = 0.06; 
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        char type;
        int id;
        double pay;
        System.out.print("What is your first name? ");
        firstName = input.nextLine();
        System.out.print("What is your last name? ");
        lastName = input.nextLine();
        System.out.print("What is your ID? ");
        id = input.nextInt();
        System.out.print("What is your employee type: ");
        type = input.next().charAt(0);
        if(type == 's' || type == 'S'){
            double salary;
            System.out.print("What is your salary? ");
            salary = input.nextInt();
            System.out.println("Your salary is: " + salary);
        }
        else if(type == 'h' || type == 'H'){
            double hourlyRate;
            int hours;
            System.out.print("What is your hourly rate? ");
            hourlyRate = input.nextDouble();
            System.out.print("How many hours do you work? ");
            hours = input.nextInt();
            if(hours <= 40){
                pay = (hourlyRate * hours) * (1 - (FEDERAL_TAX + RC + SST));
                System.out.println("Your salary is: " + pay);
            }
            else if(hours > 40){
                double baseRate = 1.5;
                pay = (hourlyRate * hours * baseRate) * (1 - (FEDERAL_TAX + RC + SST));
                System.out.printf("Your salary is: %.2f", pay);
            }
            else
            System.out.println("Error");
        }
        else
            System.out.println("Error");
    }
}
