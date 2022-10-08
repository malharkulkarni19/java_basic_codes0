public class FloatChallenge {
    public static void main(String[] args){
        float petrolQuantity, dieselQuantity;
        double petrolQuantity1, dieselQuantity1;
        float petrolPrize = 74.91f;
        float dieselPrize = 84.11f;
        float walletBalance = 1546.12f;
        double petrolPrize1 = 74.91;
        double dieselPrize1 = 84.11;
        double walletBalance1 = 1546.12;

        petrolQuantity = walletBalance / petrolPrize;
        dieselQuantity = walletBalance / dieselPrize;
        petrolQuantity1 = walletBalance1 / petrolPrize1;
        dieselQuantity1 = walletBalance1 / dieselPrize1;

        System.out.println("The Quantity of petrol we can buy in "+ walletBalance + "is " + petrolQuantity);
        System.out.println("The Quantity of petrol we can buy in "+ walletBalance + "is " + dieselQuantity);
        System.out.println("The Quantity of petrol we can buy in "+ walletBalance1 + "is " + petrolQuantity1);
        System.out.println("The Quantity of petrol we can buy in "+ walletBalance1 + "is " + dieselQuantity1);
    }
}
