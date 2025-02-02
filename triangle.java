import java.util.Scanner;

public class triangle {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of the triangle :");
        int length=scanner.nextInt();
        System.out.println("enter the base of the triangle :");
        int base=scanner.nextInt();
        double area_of_triangle=0.5*length*base;
        System.out.println("Area of triangle is :"+area_of_triangle);
        scanner.close();

    }
}
