package decisions;

import java.util.Scanner;

public class GradeRemark {
    public static void main(String[] args) {

        System.out.println("Write your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String msg;

        switch (grade.toUpperCase()){
            case "A":
                msg = "Great Job!";
                break;
            case "B":
                msg = "Good Job!";
                break;
            case "C":
                msg = "You have to work bit more";
                break;
            case "F":
                msg = "Oh no! better luck next time";
                break;
            default:
                msg ="Error! invalid input";
        }

        System.out.println(msg);
    }
}
