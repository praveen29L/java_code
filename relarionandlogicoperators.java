public class relarionandlogicoperators {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        System.out.println("a>b:"+(a>b));
        System.out.println("a>b="+(a>=b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a==b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));
        System.out.println("&&:"+(a<=10 && b<=30));
        System.out.println("||:"+(a!=17 || b<=30));
        System.out.println("!:"+(a!=17 && b<=30));

        if (a!=b){
           System.out.println("true");
        }else{
            System.out.println("flase");
        }
        
        if (a!=17 && b<=30){
            System.out.println("true");
         }else{
             System.out.println("flase");
         }
     
    }
    
}
