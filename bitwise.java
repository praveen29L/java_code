import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int diff = a-b;
        int k=(diff>>31)&1;
        int max = a * (1 - k) + b * k;
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);
        sc.close();
    }
}
