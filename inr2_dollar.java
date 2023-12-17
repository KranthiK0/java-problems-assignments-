import java.util.Scanner;

public class inr2_dollar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the amount in inr ");
        int inr = sc.nextInt();

        // assuming today rate - 17 dec 2023 
        float  current_exchange = 83.04f ;

        double dollar_amount = inr/ current_exchange;
        System.out.println("equivalent amount of " +inr + " rupees  is : " + dollar_amount + "$");

    }
}
