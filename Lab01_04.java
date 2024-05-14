public class Lab01_04 {
    public static void main(String[] args) {
        int numOfShares = 600;
        double price = 21.77, commission = 0.02;
        double amountPaid = numOfShares * price;
        double amountCommision = amountPaid * commission;
        double totalAmount = amountCommision + amountPaid;
        System.out.println(totalAmount);
    }
}
