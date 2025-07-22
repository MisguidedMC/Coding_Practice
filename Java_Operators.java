import java.util.Scanner;
public class Java_Operators{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Arithemetic Operators
            Symbol      Purpose 
            +           Addition
            -           Subtraction
            *           Multiplication
            /           Division
            ++          increment
            --          Decrement
         */


        // int add;
        // int sub;
        // int mult;
        // int div;
        // int incre;
        // int decre;

        // int num = 10;

        System.out.println("Please choose a Operator for calculating");
        System.out.println(" + = Addition");
        System.out.println(" - = Subtraction");
        System.out.println(" * = Multiplication");
        System.out.println(" / = Division");
        System.out.println(" ++ = Increment");
        System.out.println(" -- = Decrement");

        String input = scanner.nextLine();

       

        scanner.close();
    }
}