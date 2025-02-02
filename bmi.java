import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weigth in kg : ");
        int weigth=sc.nextInt();
        System.out.println("Enter the heigth in meters : ");
        float heigth=sc.nextFloat();
        double bmi = weigth/(heigth*heigth);
        System.out.println("body mass index is : "+bmi);
        sc.close();
    }
    
}
