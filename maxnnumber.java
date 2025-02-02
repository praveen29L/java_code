import java.util.Scanner;

public class maxnnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the frist number : ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number : ");
        int c=sc.nextInt();
        int max=(a>b)? (a>c ? a:c) : (b<c ? b:c);// tenary operator
        System.out.println("the maximum number among three is : "+max);
        sc.close();

    }
    
}
