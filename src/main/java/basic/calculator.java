package basic;

public class calculator {

    public static void main(String[] args) {
        int sum = calculateSum(10, 15);
        System.out.println("Total: " + sum);
    }

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int calculateSubtract(int a, int b){
        int sub = a - b;
        return sub;
    }

}
