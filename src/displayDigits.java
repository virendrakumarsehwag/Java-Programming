import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number");
        int n=sc.nextInt();
        int r=1;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);

        }

    }
}
