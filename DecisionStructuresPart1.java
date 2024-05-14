import java.util.Scanner;

public class DecisionStructuresPart1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int age;
        // System.out.print("How old are you?");
        // age = input.nextInt();
        // if(age >= 18){
        //     System.out.println("Your are eligible yo vote");
        // }
        // else
        // System.out.println("Youre a minor lol");
        
        
        // int x = 0, y = 15, z = 0;
        // if(x > 0){
        //     if(y < 20){
        //         z = 1;
        //     }
        //     else {
        //         z = 0;
        //     }
        // }
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);


        // int score = 85;
        // char letterScore = 'F';
        // if(score >= 90 && score <= 100){
        //     letterScore = 'A';
        // }
        // else if(score >= 80 && score < 90){
        //     letterScore = 'B';
        // }
        // else if(score >= 70 && score < 80){
        //     letterScore = 'C';
        // }
        // else if(score >= 60 && score < 70){
        //     letterScore = 'D';
        // }
        // else if(score >= 0 && score < 60){
        //     letterScore = 'F';
        // }
        // System.out.println(letterScore);

        int hours = 16;
        double fee = 0, minFee = 3, maxFee = 10, addFee = 0.5;
        if(hours >= 0 && hours <= 3){
            fee = minFee;
            System.out.println("Your fee is $" + fee);
        }
        else if(hours > 3 && hours <= 24){
            if(hours > 3 && hours < 17){
                fee = minFee + (addFee * (hours - 3));
                System.out.println("Your fee is $" + fee);
            }
            else if(hours >= 17){
                fee = maxFee;
                System.out.println("Your fee is $" + fee);
            }
        }
        else if (hours > 24){
            System.out.println("Error");
        }

        
    }
}
