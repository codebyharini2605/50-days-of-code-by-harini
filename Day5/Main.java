
package Day5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name you want to reverse:");//Ask the user to enter he name which have to reverse
        String name=scanner.next();
        String ans=reverseString(name);
        System.out.println(ans);
        scanner.close();

    }
    static String reverseString(String name){
        String reversed="";
        for (int index = name.length()-1; index >=0; index--) {//looping as reverse *** decreament
            reversed+=name.charAt(index);//here index of the each element index is converted into the char
        }
        return reversed;


    }}