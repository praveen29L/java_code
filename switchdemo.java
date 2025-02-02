import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("hi");
                break;
        
            default:
            System.out.println("bye");
                break;
        }

    }
    
}
