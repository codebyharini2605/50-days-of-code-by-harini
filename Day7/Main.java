package Day7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(("Enter the number:"));
        int num=scanner.nextInt();
        int factorial=1;
        int ans=factorial_is(num,factorial);
        System.out.println(ans);
        scanner.close();

        
    }
    static int factorial_is(int num , int factorial){
        for (int index = 1; index <=num; index++) {
            
            factorial=factorial*index;
    }
    return factorial;
    
    }
}