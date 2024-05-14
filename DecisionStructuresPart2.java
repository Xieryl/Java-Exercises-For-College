/**
 * DecisionStructuresPart2
 */
import java.util.Scanner;
public class DecisionStructuresPart2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // char letter;
        // System.out.print("insert your letter bitch: ");
        // letter = input.next().charAt(0);

        // switch(letter){
        //     case 'A': System.out.println("80% - 100%"); break;
        //     case 'B': System.out.println("70% - 79%"); break;
        //     case 'C': System.out.println("60% - 69%"); break;
        //     case 'D': System.out.println("50% - 59%"); break;
        //     case 'F': System.out.println("0% -  49%"); break;
        //     default: System.out.println("not defined");
        // }

        int month = 7, days = 0;
        switch(month){
        case 1, 3, 5, 7, 8, 10, 12:
            days = 31;
            System.out.println("Month " + month + " Has " + days + " days");
            break;
        case 4, 6, 9, 11:
            System.out.println("Month " + month + " Has " + days + " days");
            break;
        case 2:
            System.out.println("Month " + month + " Has " + days + " days");
            break;
        default:
            System.out.println("THATS NOT A MONTh STOOPID");
            break;
        }
    }
}