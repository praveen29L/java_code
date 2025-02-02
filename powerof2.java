import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        if ((num&num-1)==0){
            System.out.println("yes it's power of two");
        }else{
            System.out.println("it's not a power of two");
        }

        
    }
}
