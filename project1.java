import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for Espresso ");
        System.out.println("2 for Cappuccino");
        System.out.println("3 for Latte");
        System.out.println("Enter your choices");
        int choices=sc.nextInt();
        double bill=0;
        if (choices==1){
            bill+=200;     
        }else if(choices==2){
            bill+=250;
        }else if(choices==3){
            bill+=300;
        }else{
            System.out.println("invalid choice");
        }
        System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
        int add=sc.nextInt();
        if (add==1){
            bill+=30;
        }
        System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)");
        int flavor=sc.nextInt();
        if(flavor==1){
            System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
            int flavor_choices=sc.nextInt();
            if(flavor_choices==1){
                bill+=20;

            }else if(flavor_choices==2){
                bill+=25;
            }
        }
        System.out.println("Final total bill is : "+bill);

        

    }
}
