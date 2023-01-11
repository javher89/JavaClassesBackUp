package Class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        //Line below helps us get the input from the keyboard
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
