//Simple calculator
package Day3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number_1=scanner.nextInt();
        System.out.println("Enter second number: ");
        int number_2=scanner.nextInt();
        System.out.println("Choose the operator: + - * /");
        char operator=scanner.next().charAt(0);
        double Add , Sub,Multiply,Divide;
        switch(operator){//here we use switch statements
            case '+':
                Add=number_1+number_2;
                System.out.println(Add);
                break;
            case '-':
                Sub=number_1-number_2;
                System.out.println(Sub);
                break;
            case '*':
                Multiply=number_1*number_2;
                System.out.println(Multiply);
                break;
            case '/':
                Divide=number_1/number_2;
                System.out.println(Divide);
                break;
            }
            scanner.close();
            System.err.println("Day 3 Completed!");
}
}

