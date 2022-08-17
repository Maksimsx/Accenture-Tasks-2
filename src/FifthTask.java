import java.util.Scanner;
public class FifthTask {
    static void booleanMethod(){
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value b1: ");
        boolean a = sc.nextBoolean();
        if(a == false){
            b = true;
            System.out.println("Opposite of " + a + " is " + b);
        }else{
            System.out.println("Opposite of " + a + " is " + b);
        }
    }
}
