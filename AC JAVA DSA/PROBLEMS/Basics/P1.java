// AREA OF CIRCLE

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        // double radius = 5.0;
        // double area = Math.PI * radius * radius;
        // System.out.println("Area of the circle: " + area);

        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = (float) (Math.PI * rad * rad);
        System.out.println("Area of the circle: " + area);
    }
}
