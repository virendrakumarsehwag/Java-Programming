import java.util.Scanner;

public class factorialOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        long fac=1;
        for (int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println("Factorial is "+fac);
    }
}
