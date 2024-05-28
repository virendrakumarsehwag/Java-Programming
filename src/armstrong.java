import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number");
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while (n>0)
        {
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println(sum);
        if (sum==m)
        {
            System.out.println("It is Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
