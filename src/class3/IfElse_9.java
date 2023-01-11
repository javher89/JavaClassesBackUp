package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M'){ //using 2 "=" to compare, are they the same? if we replace M with C, our print will not deliver
            System.out.println("Male");
        }

        String name="Nat";

        if(name.equals("Sam")){ // non-primitive data types do not accept the "==" comparison
            System.out.println("Amazing student");
        }

        if(!name.equals("Sam")) { //
            System.out.println("Super Amazing student");
        }
    }
}
