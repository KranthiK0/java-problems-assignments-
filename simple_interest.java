import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the principal amount : ");
        int  principal = sc.nextInt();
        System.out.println(" enter the interest   : ");
        float interest = sc.nextFloat();
        System.out.println(" enter the time : ");
        int time = sc.nextInt();

        float simple_interest = ((principal * interest * time )/ 100) ;
        System.out.printf("simple interest is : " + simple_interest);

    }
}
