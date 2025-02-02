import java.util.Scanner;

public class bitwiseoperator {
    public static void main(String[] args) {
        int a=10,b=1;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&1)==1){//here least signicant bit(lsb) will checked
            System.out.println("number is odd");
        }else{
            System.out.println("number is even");
        }
        int num=sc.nextInt();
        if ((num&3)==0){//here last two bits are 0
            System.out.println("number is divisible by 4");
        }else{
            System.out.println("number is not divisible by 4");
        }
        System.out.println(a<<3);
        System.out.println(a>>>3);
        System.out.println(b>>31);

        sc.close();

    }
    
}
