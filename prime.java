import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("invalid number");
        }else{
        for(int i=2;i<n;i++){
            if(n%i!=0){
                System.out.println("it is a prime number"+i);
                break;
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}
}
