import java.util.Scanner;

public class Lab01_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1 % num2 == 0)
            System.out.println(num1 + " is a multiple of " + num2);
        else
            System.out.println("Lol loser");
    }
}
