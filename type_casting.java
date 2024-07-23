import java.util.Scanner;
public class type_casting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
             // float num=input.nextFloat();
        // int num=input.nextInt();

        //type casting
        int num=(int)(67.66f);
        System.out.println(num);

        //~ automatic type promotion in expressions
        // int a=257;
        // byte b=(byte)(a); // b-> 257%256=1 because byte can store upto 256
        // System.out.println(b);
        
        // byte a=input.nextByte();
        // byte a=40;
        // byte b=50;
        // byte c=100;
        
        // int d= a * b / c;

        // System.out.println(d);

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);
        input.close();
    }
}
