import java.util.Scanner;

public class FirstTask {
    static void myMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int x = sc.nextInt();
        System.out.print("Enter value b: ");
        int y = sc.nextInt();

        if(x == y){
            System.out.println("is " + x + " equal to " + y + "? - true");
        }else{
            System.out.println("is " + x + " equal to " + y + "? - false");
        }
        if(x < y){
            System.out.println("is " + x + " less than " + y + "? - true");
        }else{
            System.out.println("is " + x + " less than " + y + "? - false");
        }
        if(x <= y){
            System.out.println("is " + x + " less or equal to " + y + "? - true");
        }else{
            System.out.println("is " + x + " less or equal to " + y + "? - false");
        }
        if(x > y){
            System.out.println("is " + x + " greater than " + y + "? - true");
        }else{
            System.out.println("is " + x + " greater than " + y + "? - false");
        }
        if(x >= y){
            System.out.println("is " + x + " greater or equal to " + y + "? - true");
        }else{
            System.out.println("is " + x + " greater or equal to " + y + "? - false");
        }
    }
}
