package Day13;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,1};
        int sum=0;
        int ans=sumArray(arr,sum);
        System.out.println(ans);
        


    }
    static int sumArray( int[] arr ,int sum){
        
        for (int index = 0; index < arr.length; index++) {
            sum=sum + arr[index];

            
        }
        return sum;
    }
    
}
