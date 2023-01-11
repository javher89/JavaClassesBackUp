package Class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        //Line below helps us get the input from the keyboard
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name=input.nextLine();
        System.out.println("My name is "+name);
    }
}
