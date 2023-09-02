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
        DecimalFormat df = new DecimalFormat("0.00");

//        4. Display results
        System.out.println("Payable amount: " +payable);

        System.out.println(df.format(rate));


    }
}
