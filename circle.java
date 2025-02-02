import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double pi=3.14;
        System.out.println("Enter the value of radius : ");
        double r=sc.nextDouble();
        double Area_of_a_circle=pi*r*r;
        double circumference=2*pi*r;
        System.out.println("the Area of a circle is : "+Area_of_a_circle);
        System.out.println("the circumference of circle is : "+circumference);
        sc.close();



    }
}
