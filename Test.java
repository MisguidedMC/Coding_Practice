import java.util.Scanner;
public class Test {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello from test.java!");
        System.out.println("Can u enter your age!!");
        int age = scanner.nextInt();
        System.out.println("This yo age: "+ age);
        System.out.println("testing if this updates directly on github");
        System.out.println("Greetings");
        System.out.println(69+69);
        System.out.println(60*100);
        
   
        // final is used instead of const in java to declare a constant variable
    
        // Variable types

        // Integer
        int num=123;

        // Double 

        double kool= 4.69;
        
        // Boolean

        boolean makeKoolAid = true;

        // Char

        char intial='P';

        // String

        String name="PDSingh";
        System.out.println(name);
        System.out.println(num*num);
        System.out.println(kool);
        
        if(makeKoolAid=true){
            System.out.println(intial);
            System.out.println(makeKoolAid);
        }
        String First_Name="Pranay ";
        String Middle_Name="Deep ";
        String Last_Name="Singh";
        String Full_Name=First_Name + Middle_Name + Last_Name;
        System.out.println(Full_Name);

        double area,x,y,z;
        x=10.2345678;
        y=133.234567;
        z=13.234565432;

        area = ( (x * z) + y );
    
        System.out.println("This is the area of a imaginary object: " + area );

        scanner.close();  
    }
}
