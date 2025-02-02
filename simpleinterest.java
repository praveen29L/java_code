import java.util.Scanner;

public class simpleinterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int amount = sc.nextInt();
        System.out.println("Enter the interest rate :");
        int rate=sc.nextInt();
        System.out.println("Enter how many years");
        int years=sc.nextInt();
        int simple_interest=amount*rate*years/100;
        System.out.println("simple intesert is : "+simple_interest);
        sc.close();



    }

}