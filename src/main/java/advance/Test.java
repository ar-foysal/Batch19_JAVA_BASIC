package advance;

import advance.Rectangle;

import static advance.Month.getMonth;

public class Test {
    public static void main(String[] args) {

        Rectangle rome1  = new Rectangle(5,10);
        double area1 = rome1.calculateRectangleArea();
        System.out.println("Total area for roam One: " + area1);

        Rectangle rome2 = new Rectangle();
        rome2.setLength(4);
        rome2.setWidth(10);
        double area2 = rome2.calculateRectangleArea();
        System.out.println("Total area for roam One: " + area2);
//        Test test = new Test();
//        test.getTotalArea(area1, area2);
        getTotalArea(area1, area2);


        System.out.println(getMonth("May"));
    }

    public static double getTotalArea(double room1, double room2){
        return room1 + room2;
    }
}
