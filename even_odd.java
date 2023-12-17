import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the number : ");
        int number = sc.nextInt();

        if(number % 2 == 0 )
            System.out.printf("given number : " + number + " is even number "  );
        else
            System.out.printf("given number : " + number + " is odd number ");
    }
}
