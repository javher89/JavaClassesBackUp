package class3;

public class RelationalOperators_6 {
    public static void main(String[] args) {
        /*
        int+int=int
        int/int+int
        etc.
        however, these relation operations change the data type
         */
        int number=10;
        int number2=10;
        System.out.println(number+number2);
        boolean results=20>10;//Java recognizes this math operation, the ">" data type is however, boolean, not int
        System.out.println(results);
        /*
        == equal to
        ! not equal to
        >= greater or equal
        <= less or equal
         */

        System.out.println(20>10); //we're asking if 20 is greater than 10 = true
        System.out.println(5>10); // is 5 greater than 10? = false
        System.out.println(5!=10); //is 5 not ("!" not symbol) equal to 10? = true
        System.out.println(5==10);//we use 2 "=" to ask Java, is 5=10? false
        System.out.println(5==5);//we use 2 "=" to ask Java, is 5=5? true
        System.out.println(10>=20);//is 10 greater or equal to 20? false
        System.out.println(10<=20);//is 10 less than or equal to 20? true
        System.out.println(10<=10);//is 10 less than or equal to 10? true
    }
}
