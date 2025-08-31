// TYPE CONVERSION AND CASTING AND PROMOTION

public class P2 {
    public static void main(String[] args) {

        //Type Conversion and Casting
        int a = 10;
        double b = 20.5;
        double c = a;  // Implicit conversion (int to double)
        int d = (int) b;  // Explicit conversion (double to int)

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Converted Double: " + c);
        System.out.println("Converted Integer: " + d);


        
        //Type Promotion
        int e = 30;
        double f = 40.5;
        double g = e + f;  // Type promotion (int to double)

        System.out.println("Promoted Double: " + g);


        // NOTED
        //WRONG
        //byte b = 5;
        //b = b*2; // compiler treated b as int...* means they are expression therefore result is int

        // right
        // byte b = 5;
        // b = (byte)(b*2);
    }
}
