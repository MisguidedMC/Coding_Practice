import java.util.Random;
public class Java_Methods{
    static Random random = new Random();
    


    public static void main(String[] args) {
        int num = 10;
        int[] array= new int[10];

       for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
       }
       // this method adds the 10 random numbers generated and outputs the result
       Sum_Arr(array);
       while ( num > 0){

        System.out.println("Num: "+ (int)(Math.random()*10));

        num--;
        
       }
        calc();
        System.out.println(Sum(1234,12346,2346,3456,55,5,5,5,5,5,5,5));
        
        Overload(1);
        Overload(2,345);
        Overload(69, 2345, 2367);
       System.out.println("Recursion: "+ Recursion(2, 8));
    }

    // this is a method 
    static void calc(){
        int x = 5;
        System.out.println("X is " + x);
    }

    // method parameters
    static void Sum_Arr(int[] array){
        int sum=0;
        for(int i : array){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of the Array is: " + sum);
    }
    // this is a vararg
    static int Sum(int... name){
        int sum=0;
        for ( int i : name){
            sum+=i;
        }
        return sum;
    }

    // static int
    // static double
    // static float 


    static void Overload(int x){
        System.out.println(x);
    }
    static void Overload(int x, int y){
        System.out.println(x+" "+y);
    }
    static void Overload(int x, int y, int z){
        System.out.println(x+" "+y+" "+z);
    }

    //Recursion

    static int Recursion(int x,int y){
        if ( y< 1)return 1;
        return x*Recursion(x, y-1);
    }
    
}