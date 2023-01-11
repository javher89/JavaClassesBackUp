package class3;

public class IfElse_8 {
    public static void main(String[] args) {
        int age=17;

        if(age<18)
        {
            System.out.println("Let's play");
        }

        boolean inSyntaxBootCamp=true; //If you write false, you will not see what you print
        /*
        If conditions work based on boolean true or false
        if we have a true inside the if () it executes all the code inside {}
        if it is false it doesn't execute any code inside {}
         */

        if(inSyntaxBootCamp){ //you can write the variable, or true, as the = sign relates both
            System.out.println("time to start practicing java");
        }
    }
}
