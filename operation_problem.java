import java.util.Scanner;

public class operation_problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the first number ");
        int number1 = sc.nextInt();
        System.out.println("enter the second number");
        int number2 = sc.nextInt();
        System.out.println("enter the operation ");
        String operation = sc.next().trim();

        if(operation.equals("+"))
        {
            int ans = number1 + number2 ;
            System.out.print("answer is : " + ans );
        }
        else if(operation.equals("-"))
        {
            int ans = number1 - number2 ;
            System.out.print("answer is : " + ans );
        }
        else if(operation.equals("*"))
        {
            int ans = number1 + number2 ;
            System.out.print("answer is : " + ans );
        }
        else if(operation.equals("/"))
        {
            if(number2 != 0 ) {
                int ans = number1 / number2;
                System.out.print("answer is : " + ans);
            }
            else {
                System.out.println("Cannot divide by zero!");
            }

        }
        else if(operation.equals("%"))
        {
            int ans = number1 % number2 ;
            System.out.print("answer is : " + ans);

        }
        else
            System.out.println(" enter correct operation ");
    }
}
