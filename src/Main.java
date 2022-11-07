import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money");
        long money = sc.nextLong();
        System.out.println("Enter the rate");
        double rateYear = sc.nextDouble();
        System.out.println("Enter the months");
        int months = sc.nextInt();

        long totalMoney = 0;

        for (int i = 1; i <= months; i++) {
            totalMoney += money * (rateYear/12) * months;
        }

        System.out.println("The total interest is: " + totalMoney);
    }
}