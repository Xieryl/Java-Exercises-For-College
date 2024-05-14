public class ArithmeticOperations {
    public static void main(String[] args) {
        double monthlyPay = 6000;
        double fivePercent = 0.05;
        double eightPercent = 0.08;
        double tenPercent = 0.10;
        
        System.out.println("If you contribute 5 percent to your retirement plan," +
                " you would get: " + (monthlyPay * fivePercent));
        System.out.println("If you contribute 8 percent to your retirement plan," +
                " you would get: " + (monthlyPay * eightPercent));
        System.out.println("If you contribute 10 percent to your retirement plan," +
                " you would get: " + (monthlyPay * tenPercent));
        
        double prodPrice = 59;
        double discount = 0.2;
        double discountAmount = prodPrice * discount;
        double finalSale = prodPrice - discountAmount;
        
        System.out.println(finalSale);
    }
}
