package decisions;

import java.util.Scanner;

public class PayEmployeeWithBonus {
    public static void main(String[] args) {
        //1. Initialize What we know
        int weeklyHourRange = 32;
        double ratePerHour = 10.0;
        double bonusAmount = 5.0;

        //2. Get number of worked hour
        System.out.println("Enter employee's number of work hours for current week");
        Scanner scanner = new Scanner(System.in);
        int workHours = scanner.nextInt();
        scanner.close();
        //3. Multiply Hours and pay
        double payable =  workHours * ratePerHour;

        //4. check for eligibility for bonus
        if (workHours > weeklyHourRange) {
            payable = payable + bonusAmount;
            System.out.println("You are eligible for bonus");
        }
        else if (workHours == weeklyHourRange) {
            System.out.println("You are not eligible for bonus in this week but you should try bit more");
        } else {
            System.out.println("You are not eligible for bonus in this week");
        }

        //4. Display results
        System.out.println("Payable amount: $" +payable);
    }
}
