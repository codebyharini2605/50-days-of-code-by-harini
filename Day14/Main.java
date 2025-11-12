//Find Maximum/Minimum in Array
package Day14;

public class Main {
    public static void main(String[] args) {
        int [] arr={2,3,4,56};
        //int temp;
        int ans=Maximum(arr);
        System.out.println(ans);

        
    }
    static int Maximum(int [] arr){
        int max=arr[0];
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]>max);{
                max=arr[index];
            }
            //return max;
            
        }
        return max;
        





    }
    
}
