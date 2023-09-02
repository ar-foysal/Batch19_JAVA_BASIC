package basic;


import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args) {
//        1. Get number of worked hour
        System.out.println("Enter employee's number of worked hours");

        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

//        2. Get hourly rate
        System.out.println("Enter employee's hourly rate");
        double rate = scanner.nextDouble();
        scanner.close();
//        3. Multiply Hours and pay
         double payable =  hours * rate;

//        4. Display results
        System.out.println("Payable amount: " +payable);

//        Collect a until 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(rate));


    }
}
