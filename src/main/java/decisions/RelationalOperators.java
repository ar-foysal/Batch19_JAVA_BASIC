package decisions;

public class RelationalOperators {
    public static void main(String[] args) {

        if (1<3)
            System.out.println("1. 1 is less than 3");
        if(1>0)
            System.out.println("2. 1 is greater than 0");
        if (2<=2)
            System.out.println("3. 1 is less or equal to 2");
        if (1>=2)
            System.out.println("4. 1 is greater or equal to 2");
        if (2!=2)
            System.out.println("5. 1 is is not equal to 2");

        String value1 = "Aa A";
        String value2 = "Aa";
        if (value1.equals(value2))
            System.out.println("6. value1 is equal to value2");

        if (2!=3 && 1==1)
            System.out.println("7. AND");

        if (2!=2 || 1==1)
            System.out.println("8. OR");
    }
}
