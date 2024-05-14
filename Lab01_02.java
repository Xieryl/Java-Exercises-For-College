import java.util.Scanner;

public class Lab01_02 {
    public static void main(String[] args) {
        final double FEDERAL_TAX = 0.05;
        final double PROVINCIAL_TAX = 0.0975;
        Scanner input = new Scanner(System.in);
        double originalPrice, discountRatio, beforeTax, finalPrice;
        double federalPrice, provincialPrice;
        System.out.print("Please input the original price of your item: ");
        originalPrice = input.nextDouble();
        System.out.print("insert your discount: ");
        discountRatio = input.nextDouble();
        beforeTax = originalPrice - (originalPrice * (discountRatio / 100));
        federalPrice = beforeTax * FEDERAL_TAX;
        provincialPrice = beforeTax * PROVINCIAL_TAX;
        finalPrice = beforeTax + federalPrice + provincialPrice;
        //Prints out the receipt
        System.out.printf("Original Price   : %.2f\n", originalPrice);
        System.out.printf("Discount Price   : %.2f\n", discountRatio);
        System.out.printf("Price Before Tax : %.2f\n", beforeTax);
        System.out.println("------------------------------------------");
        System.out.printf("Federal Tax      : %.2f\n", federalPrice);
        System.out.printf("Provincial Tax   : %.2f\n",provincialPrice);
        System.out.printf("Final Price      : %.2f\n", finalPrice);

        
    }
}
