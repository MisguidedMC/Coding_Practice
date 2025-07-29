import java.util.Random;
import java.util.Scanner;
public class Java_Ifelse{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // This lesson covers If else statements and Switch cases in Java

        // if statements

        int x=8;
        int y=90;

        if(x>y){
            System.out.println("X is smaller then Y");
        }

        System.out.println("Can u please enter your age");
        int age = scanner.nextInt();

        if ( age < 18 && age > 0){
            System.out.println("you are not an adult!, please transfer to an adult");
        }else if ( age >= 18){
            System.out.println("You are of age, so you may vote Please proceed ");
        }else{
            System.err.println("Invalid input");
        }
    

    // including also Switch Cases

    int randomnum = random.nextInt(11);

    switch (randomnum){
        case 1 -> System.out.println("test");
        case 2 -> System.out.println("testing");
        case 3 -> System.out.println("test this is a test");
        case 4 -> System.out.println("test horray this test worked");
        case 5 -> System.out.println("test hey whats up buddy");
        case 6 -> System.out.println("test did ya know that i am testing?");
        case 7 -> System.out.println("test OMG i am TESTING");
        case 8 -> System.out.println("test damn bro that was insane");
        case 9 -> System.out.println("test finale is near");
        case 10 -> System.out.println("test Finale is here!");
        default -> {
            }
    }
    int num =0;
    while (num < 10){
        int randomnum2 = random.nextInt(11);
        switch (randomnum2){
        case 1 -> System.out.println("test");
        case 2 -> System.out.println("testing");
        case 3 -> System.out.println("test this is a test");
        case 4 -> System.out.println("test horray this test worked");
        case 5 -> System.out.println("test hey whats up buddy");
        case 6 -> System.out.println("test did ya know that i am testing?");
        case 7 -> System.out.println("test OMG i am TESTING");
        case 8 -> System.out.println("test damn bro that was insane");
        case 9 -> System.out.println("test finale is near");
        case 10 -> System.out.println("test Finale is here!");
        default -> {
            }
    }
    num++;
}

    do{
        System.out.println("Hey we executed a do while loop");
        num--;
    }while(num>0);
    
    // For loops 

    for (int i = 0; i < 10; i++) {
        System.out.print("So many loops ");
        
    }
    System.out.println("");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("This is a nested for loop ");
        }
    }
    System.out.println("");

    // for each loop

    String[] arr = {"Volkswagon", "Mercedez", "Benz", "BMW" };
    System.out.println("");
    for (String i : arr) {
        System.out.println(i);
        System.out.println("");
    }

    // breaks, pretty self explanatory, but is used when you are trying to exit a loop 
    // Continue, would continue to the next iteration of the loop like we are at i=2 it would go to i=4

    // Arrays, similar to c++ but the declaring is slightly different

    // instead of String array[]={};     its String[] array={};

    // 2 d arrays is like String[][] arr={};

    int[][] array ={{1,3,5,7},{2,4,6,8}};

    for (int i = 0; i < 2; i++) { //row
        for (int j = 0; j < 4; j++) { //column
            System.out.println(array[i][j]);
        }
    }
    scanner.close();
}
}