public class Java_Math{
    public static void main(String[] args) {
        // This lesson covers Java Math method

        // Math <- class name 
        // 1st method .min finds minimum value of x and y value
        int x=8;
        int y=144;
        int num1=-4;
        int num2=98;
        System.out.println((Math.min(x,y)));

        // 2nd method, .max finds the max value
        System.out.println("");
        System.out.println(Math.max(x,y));

        // 3rd method .sqrt finds the square root
        System.out.println("");
        System.out.println(Math.sqrt(y));

        // 4th method .abs finds the absolute value aka positive number
        System.out.println("");
        System.out.println((Math.abs(num1)));

        // 5th Method .random finds a random number between 0-1

        System.out.println("");
        System.out.println((Math.random()));

        // using the 5th method we can specify a range

        int num = 10;
        while (num>0){
            System.out.println((Math.random()*101));
            // in order to specify a range from 0 to x number u need to multiply it by the number x and add 1
            // therefore the range is 0 to 100 in this case
            num--;
            //used to decrement and exit loop
        }
    }
}