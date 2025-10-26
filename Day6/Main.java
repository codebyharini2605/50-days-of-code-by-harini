package Day6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        if(primeNumber(num)){
            System.out.println(num +" is a prime number");
        }
        else{
            System.out.println(num+ " is not a prime number");
        }
        scanner.close();


        
    }

    static boolean primeNumber(int num){
        
        if (num<=0){
            return false;
            }
        for (int index = 2; index <= Math.sqrt(num); index++) {
            if( num %index ==0){
                return false;
            }
        }
        return true;
        
        

    }}

