//Keep Entering Numbers Till User Enters A Multiple of 10

import java.util.*;

public class P6{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter your Number:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}