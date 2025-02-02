public class datatype {
    public static void main(String[] args) {
        byte num2=127;
        short num3=32767;
        int num=214748364;
        long num1=2147483644;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        datatype id = new datatype();
        id.display();

    }
    void display(){
        int min_value=Integer.MIN_VALUE;
        int max_value=Integer.MAX_VALUE;//wrapper class
        int min_value=Integer.MIN_VALUE-1;// no error because it wrap around is under flow
        int max_value=Integer.MAX_VALUE+1;//no error because it wrap around is over flow
        byte min_value=Byte.MIN_VALUE;//in byte wrapper around is not possible
        byte max_value=Byte.MAX_VALUE;
        byte a=(byte)(min_value-1);//u need to convert int to byte by type casting and same for short also
        System.out.println("minimum value is "+min_value);
        System.out.println("maximum value is "+max_value);
        System.out.println(a);

    }
    
    
}
