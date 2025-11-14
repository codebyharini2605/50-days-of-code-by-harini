//package Day16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,8,9,64};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }}