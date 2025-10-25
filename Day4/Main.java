//fnding fibo series of n numbers
package Day4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int previous=0;
        int current_index=1;
        int count=2;
        while(count<=num){
            int temp=current_index;
            current_index=current_index+previous;
            previous=temp;
            count++;
        
        
        }
        System.out.println(current_index);
        scanner.close();
    }
    
}
