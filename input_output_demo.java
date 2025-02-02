import java.util.Scanner;

public class input_output_demo {
    
    int num;
    public static void main(String[] args) {
        input_output_demo obj =new input_output_demo();
        System.out.println("what is ur name : ");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        System.out.println("ur name is : "+name);
        obj.display();
        scanner.close();
    }
    void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scanner.nextInt();
        System.out.println("the num is :"+num);
        scanner.close();
    }
}
