//Find minimum number in the array
package Day15;



public class Main {
    public static void main(String[] args) {
        int [] arr={2,3,4,56};
        //int temp;
        int ans=Minimum(arr);
        System.out.println(ans);

        
    }
    static int Minimum(int [] arr){
        int min=arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index]<min){
                min=arr[index];
            }
            //return max;
            
        }
        return min;
        





    }
    
}

    
