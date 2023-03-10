package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computers memory
        we are calling it box1 if we need the information that we are storing inside this box
        we can simply say to the computer give us the contents of box1.
        int=> what type of data we want to store
        box1=? is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        //if we are printing something from a box we don't need "" they're only required when we're directly printing something
        System.out.println(box1); // bring the contents of box1 and print them on the console
        double box2=10.5;
        System.out.println(box2);
        /*To store whole numbers we have 4 different types of boxes
        for example numbers like 10 20 3000 100000
        1) byte 2) short 3) int 4) long
         */
        byte box3=-128;
        byte box4=127; //range for byte is from -128 to 127 if we need to store larger numbers we should try short
        short box5=32767;
        int biggerBox=123456484; //most common type of box
        long maxBox=1243412312312l;
        short myBox=10000;
        System.out.println(myBox);



    }
}
