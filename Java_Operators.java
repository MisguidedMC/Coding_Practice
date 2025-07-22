public class Java_Operators{
    public static void main(String[] args) {
        /* Arithemetic Operators
            Symbol      Purpose 
            +           Addition
            -           Subtraction
            *           Multiplication
            /           Division
            ++          increment
            --          Decrement
         */


        int add;
        int sub;
        int mult;
        float div;
        int incre;
        int decre;

        int num = 10;


        System.out.println(" + = Addition");

        System.out.println(" - = Subtraction");
        System.out.println(" * = Multiplication");
        System.out.println(" / = Division");
        System.out.println(" ++ = Increment");
        System.out.println(" -- = Decrement");


        add = 10 + 7;

        System.out.println(add);

        sub = 40-24;

        System.out.println(sub);

        mult = 16 * 4; 

        System.out.println(mult);

        div = 69/7.93f;

        System.out.println(div);


       while(num >= 0){
            System.out.println(num);
            num--;
          
       }
        System.out.println("");
        while( num <= 10 ){
            System.out.println(num);
                    num++;
                   
         }
            
        
    }
}