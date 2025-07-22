
public class Java_Strings{
    public static void main(String[] args) {
        String name = "Pranay Deep Singh";

        System.out.println("My full name has a length of " + name.length() + " using length method");

        System.out.println("This is my name in lowercase " + name.toLowerCase());
        System.out.println("");
        System.out.println("This is my name in Uppercase " + name.toUpperCase());
        String sentence = "This sentence is used to test locate a character in a string which was at index: ";
        System.out.println(sentence + sentence.indexOf("string"));
        System.out.println("");
        System.out.println("For clarity at index 54 was the word String");
    
    // Moving onto CONCAT aka concatenation

        String Fname = "Pranay";
        String Mname = "Deep";
        String Lname = "Singh";
        System.out.println("");
        System.out.println("Below is the result of concat using 3 string variables to output it in one");
        System.out.println(Fname + " " + Mname + " " + Lname );
        System.out.println("The method method used the direct concat method");
        System.out.println(Fname.concat(Mname+Lname));

        // moving onto numbers and strings 

        // addings 2 numbers would be like 10+10 giving 20 but when adding string its different as shown below

        int x=10;
        int y=5;
        String ten="10";
        String five="5";
        System.out.print("Addition of 2 numbers: ");
        System.out.println(x+y);
        System.out.println("");
        System.out.print("Addition of 2 Strings: ");
        System.out.println(ten+five);
        System.out.println("");
        System.out.println("Lets try adding 1 string and 1 number/int");
        System.out.print("The result is as shown: ");
        System.out.println(x+ten);

        // Java Special characters this means writing words quoted such as "Kings!" inside a string
        // java will pick it up as an error, escape seq is needed to be used to overcome this
        System.out.println("");
        System.out.println("Hey guy's is ya boy \"Misguided MC\" here back with another banger!!");

        /* Code	Result	
            \n	New Line	
            \r	Carriage Return	
            \t	Tab	
            \b	Backspace	
            \f	Form Feed
        */

    }
}