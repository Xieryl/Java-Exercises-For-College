import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 3;
        int num2 = 5;
        int num3 = 10;
        double mean = (num1 + num2 + num3)/3;
        double std = Math.sqrt(Math.abs((Math.pow(num1 - mean,2) + Math.pow(num2 - mean, 2)+ Math.pow(num3 - mean, 2))) / 3);
        System.out.println(std);
        
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        
        int randval = (int)(Math.random() * 11);
        System.out.println(randval);
        
        int dieRoll = (int)(6 * Math.random()) + 1;
        System.out.println(dieRoll);
        
        int min = 200;
        int max = 400;
        System.out.println("Random value of type double between " + min + " to " + ":");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
        System.out.println("Random value of type int between " + min + " to " + max + ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
        
        
        double radius, volume;
        System.out.println("Please enter the radius of your sphere: ");
        radius = input.nextDouble();
        volume = ((4/3)*Math.PI)*Math.pow(radius, 3);
        System.out.println("The volume of your sphere is " + volume);
    }
}
