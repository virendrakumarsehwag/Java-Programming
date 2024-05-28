import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        while (n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (rev==m)
        {
            System.out.println("Its a Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
