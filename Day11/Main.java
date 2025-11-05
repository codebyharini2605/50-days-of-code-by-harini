import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number:");
        int number_1=scanner.nextInt();
        System.out.println("Enter second number:");
        int number_2=scanner.nextInt();
        System.out.println("Enter third number:");
        int number_3=scanner.nextInt();
        int largest=Math.max(Math.max(number_1,number_2),number_3);
        System.out.println("The largest number is " + largest);
        scanner.close();
        
    }
    
}
