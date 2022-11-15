import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();


    }

    public static void exercise1(){
        String[] informations = new String[]{"32423424", "Joao Rocha"};

        System.out.println("Name: "+informations[1]+"\n" +
                "ID: "+informations[0]);
    }

    public static void exercise2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's do you want rent the car!");
        int days = sc.nextInt();
        int payOut = 35;

        if(days == 1){
            System.out.println("The price for "+days+" day is "+payOut+"$");
            return;
        }

        if(days >= 7){
            payOut = (days * payOut)-40;
            System.out.println("The price for "+days+" day's is "+payOut+"$");
            return;
        }

        payOut = (days * payOut)-10;
        System.out.println("The price for "+days+" day's is "+payOut+"$");

    }

    public static void exercise3(){
        int total = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int n : numbers){
            total = total * n;
        }

        System.out.println("The Total of: "+ Arrays.toString(numbers.toArray()) +"\n" +
                "Is: "+total);
    }

    public static void exercise4(){

    }
}