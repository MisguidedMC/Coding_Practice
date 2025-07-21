public class Java_Numbers{
    public static void main(String[] args) {
        
        //This lesson focuses on Different types of java varible tyes
        // that holds numbers

        // byte holds numbers from -128 - 128


        byte byteNum = 69;
        System.out.println("");
        System.out.println("Byte Number");
        System.out.println(byteNum);

        // short holds numberss from -32768 to 32767

        short shortNum = 690;
        System.out.println("");
        System.out.println("Short Number");
        System.out.println(shortNum);

        // int holds numbers from -2147483648 to 2147483647
        int intNum=69420;
        System.out.println("");
        System.out.println("Integer Number");
        System.out.println(intNum);

        // Long holds numbers from  from -9223372036854775808 to 9223372036854775807
        // long is ended with a L
        
        long longNum = 420000000069L;
        System.out.println("");
        System.out.println("Long Number");
        System.out.println(longNum);

        // Float and double store fraction numbers
        // float ends with a "f" and double with a "d"
        System.out.println("");
        System.out.println("Float and Doubles");
        float floatNum = 50.69f;
        double doubleNum = 69.42d;

        System.out.println(floatNum);
        System.out.println(doubleNum);

        //Scientific numbers

        float flo1 = 56E6f;
        double dub1 = 9E30d;
        System.out.println("");
        System.out.println("Scientic Numbers:");
        
        System.out.println(flo1);
        System.out.println(dub1);
    }
}