// Print numbers from 1 to 10

import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        sc.close();
    }
}