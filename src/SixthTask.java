import java.util.Scanner;

public class SixthTask {
    static void trueOrFalseMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = sc.nextInt();
        System.out.print("Enter value b: ");
        int b = sc.nextInt();

        if(a == b || a < 0 && b > 0 || a > 100 && b > 100){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
