//Check whwther the number is even or odd!
package Day2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=scanner.nextInt();
        if(number % 2==0){
            System.out.println("This number is Even");

        }
        else{
            System.out.println("This number is Odd");
        }
        scanner.close();
}
    }
