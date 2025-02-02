import java.util.Scanner;

public class aor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of the recangle :");
        int length=scanner.nextInt();
        System.out.println("enter the breath of the recangle :");
        int breath=scanner.nextInt();
        int area_of_rectangle=length*breath;
        System.out.println("Area of triangle is :"+area_of_rectangle);
        scanner.close();

    }
    
}
