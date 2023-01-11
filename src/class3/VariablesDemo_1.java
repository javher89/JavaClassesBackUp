package class3;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=33; //requesting that the computer create a box of type int and store a value of 10 in it
        int salary=0; //here we're merely creating a box type with no value assigned to it
        salary=120000; //now we're accessing the variable and updating it
        System.out.println(salary+" "+age);
        String name, city, country; //we can create multiple boxes (empty/assigned) in a single line of code
        char gender, letter; //we can do this for any type of variable
        name="Javier";
       // System.out.println(city); this will give error as the declared variable has not had a value assigned
        System.out.println(name);

    }


}
