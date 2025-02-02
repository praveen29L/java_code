import java.util.Scanner;

public class floating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a float number :");
        float num1=sc.nextFloat();
        System.out.println("Enter a float number :");
        float num2=sc.nextFloat();
        float product=num1*num2;
        System.out.println("product of two floating points :"+product);
        sc.close();
        
    }
    
}
