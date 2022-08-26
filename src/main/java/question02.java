public class question02 {

    public static void main(String[] args) {
        int[] moneyBills = {200, 100, 50, 20, 10, 5, 2, 1};
        int value = 336;
        System.out.printf("The minimum number of each money bill required to get the value %d is:\n", value);
        for (int i = 0; i < moneyBills.length; i++) {
            int moneyBillQuantity = value / moneyBills[i];
            value = moneyBillQuantity * moneyBills[i];
            System.out.printf("R$ %d = %d; ", moneyBills[i], moneyBillQuantity);
        }
    }
}
