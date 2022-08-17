import java.util.Scanner;

public class SecondTask {

    static void myMethod2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value b1: ");
        boolean a = sc.nextBoolean();
        System.out.print("Enter value b2: ");
        boolean b = sc.nextBoolean();

        if(a == b){
            System.out.println("is b1 and b2 equal? - true");
        }else{
            System.out.println("is b1 and b2 equal? - false");
        }

    }
}
