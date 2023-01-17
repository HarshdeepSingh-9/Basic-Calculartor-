import java.util.Scanner;
public class project1{
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("--welcome to the world of calculations --");
        System.out.println("READY TO SOLVE UP!!!!!!!");
        System.out.println("1-ADD , 2-SUB , 3-MULTIPLY , 4-DIVISON");
        int choice = ab.nextInt();
        System.out.println("enter digit 1");
        int digit1 = ab.nextInt();
        System.out.println("enter digit 2 ");
        int digit2 = ab.nextInt();
        System.out.print("ANSWER IS -");
        if (choice == 1) 
        {
            System.out.println(digit1+digit2);
        }
        if (choice ==2)
        {
            System.out.println(digit1-digit2);
        }
        if (choice ==3)
        {
            System.out.println(digit1 * digit2);
        }
        if (choice==4)
        {
            try {
                System.out.println(digit1/digit2);
            } catch (Exception e) {
                System.out.print("not divisible");
            }   
        }
        System.out.println("want to do calculations again yes=1 / N0=0 -");
        int againchoice = ab.nextInt();
        if (againchoice == 1)
        {
            main(args);
        }
        else 
        {
            System.out.println("-- THANK YOU --");
        }
    }
}