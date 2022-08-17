import java.util.Scanner;

public class FourthTask {
    static void myMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int x = sc.nextInt();
        if(x == 0){
            System.out.println("not odd, not even");
        }else if(x % 2 ==0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
