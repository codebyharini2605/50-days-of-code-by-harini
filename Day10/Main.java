//Swapping of given two numbers
package Day10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number_1:");
        int number_1=scanner.nextInt();
        System.out.println("Enter number_2:");
        int number_2=scanner.nextInt();
        int temp=number_1;
        number_1=number_2;
        number_2=temp;
        System.out.println("After swapping number 1 = " + number_1);
        System.out.println("After swapping number 2 = " + number_2);
        scanner.close();
        
}

    
}
