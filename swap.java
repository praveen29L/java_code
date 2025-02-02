import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value :");
        int a=sc.nextInt();
        System.out.println("enter b value :");
        int b=sc.nextInt();
         a = a+b;//a=10 b=20=30
         b=a-b;//a=30-20=10
         a=a-b;// without thrid variable
        // int temp=a;
        // a=b;
        // b=temp;
        System.out.println("a is "+a);
        System.out.println("b is  "+b);
        sc.close();
    }
    
}
