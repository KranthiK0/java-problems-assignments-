import java.util.Scanner;

public class fibnacci_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number to print fibnacci upto ");
        int n = sc.nextInt();

        int first_number = 0 ;
        int second_number = 1 ;

        fibnacci_number(first_number,second_number,n);

    }

    static void   fibnacci_number(int a , int b , int n )
    {
        if( n >= 1)
            System.out.print( a + " " );
        if(n >=2)
            System.out.print( b + " " );

        for(int i = 2; i < n ; i++)
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
