package class3;

public class ShortHandOperator_4 {
    public static void main(String[] args) {
        int number=10;
        //number=number+10;
        number+=20; //now we're changing the value of number by (+10), this can be done for any mathematical operation
        System.out.println(number);
        number*=20;
        System.out.println(number); //whatever value is stored in number will be multiplied by 20 (30*20)

        int number2=20;
        number2-=10;
        System.out.println(number2);

        int number3=100;
        number3/=10;
        System.out.println(number3);
    }
}
