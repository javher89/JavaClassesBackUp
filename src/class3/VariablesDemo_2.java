package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        int age=10;
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10;
        age=number; //now you're replacing the value of age, with the value of number
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;
        System.out.println(age); //you can modify values along the way
    }
}
