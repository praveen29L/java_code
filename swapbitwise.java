import java.util.Scanner;

public class swapbitwise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the vaule of a :");
        int a=sc.nextInt();
        System.out.println("Enter the vaule of b :");
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the value of a :"+a);
        System.out.println("the value of b :"+b);
        sc.close();

    }
}
