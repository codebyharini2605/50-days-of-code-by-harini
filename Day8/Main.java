//Sum of each digits of the number
package Day8;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        int sum=0;
        while(num>0){
            
            sum=sum+ num%10;//(sum+=i)
            num=num/10;

        }
        System.out.println(sum);

        scanner.close();
    }}

