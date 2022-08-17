import java.util.Scanner;

public class ThirdTask {

    static void OddOrEven(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int x = sc.nextInt();
        if(x == 0){
            System.out.println("not odd, not even");
        }else if(x % 2 ==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
