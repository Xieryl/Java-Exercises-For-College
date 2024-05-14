import java.util.Scanner;

public class InteractivePrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//        int num1, num2, sum;
//        System.out.println("Please enter the value of num1: ");
//        num1 = input.nextInt();
//        System.out.println("Please enter tha value of num2: ");
//        num2 = input.nextInt();
//        sum = num1 + num2;
//        System.out.println(num1 + " + " + num2 + " = " + sum);
        
//        String name;
//        int hoursWorked;
//        double hourlyPayRate;
//        //Ask the user for their name
//        System.out.println("What is your name? ");
//        name = input.nextLine();
//        //Ask them their their weekly work hours
//        System.out.println("How many hours did you work this week? ");
//        hoursWorked = input.nextInt();
//        //Ask them their hourly pay rate
//        System.out.println("What is your hourly pay rate? ");
//        hourlyPayRate = input.nextDouble();
//        System.out.println("Your gross pay is $" + (hoursWorked * hourlyPayRate)); 
        
        
//        //printf
//        int hours = 40;
//        System.out.printf("I worked %d hours.\n", hours);
//        
//        double grossPay = 874.12;
//        System.out.printf("Your pay is %.2f.\n", grossPay); //%.2f specifies at what decimal your floating point value should be rounded to
//        
//        int dogs = 2, cats = 4;
//        System.out.printf("We have %d dogs and %d cats.\n", dogs, cats);
//        
//        String name = "Ringo";
//        System.out.printf("Your name is %s.\n", name); //%s is used for string variables
//        
//        int number = 9;
//        System.out.printf("The value is %6d\n", number); //%6 indicates integre will appear
//        //in a field that is 6 spaces wide
//        
//        double numbers = 9.87654;
//        System.out.printf("The value is %6.2f\n", numbers); //%6.2 indicates the number will appear in a field
//        //thats is 6 spaces wide and be rounded to 2 decimal places
//
//        String name1 = "George";
//        String name2 = "Franklin";
//        String name3 = "Jay";
//        String name4 = "Ozzy";
//        System.out.printf("%10s%10s\n", name1, name2);
//        System.out.printf("%10s%10s\n", name3, name4);
        
        String name;
        double assignment, firstExam, secondExam, finalExam, finalGrade;
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.println("What is your assignment score? ");
        assignment = input.nextDouble();
        System.out.println("What is your first exam score? ");
        firstExam = input.nextDouble();
        System.out.println("What is your second exam score? ");
        secondExam = input.nextDouble();
        System.out.println("What is your final exam score? ");
        finalExam = input.nextDouble();
        finalGrade = assignment + firstExam + secondExam + finalExam;
        System.out.printf("Hello %s, your final score is %.2f", name, finalGrade);
    }
}
