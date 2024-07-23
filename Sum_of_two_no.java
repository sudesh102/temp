import java.util.Scanner;
public class Sum_of_two_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("The Sum is:"+sum);
    }
}
