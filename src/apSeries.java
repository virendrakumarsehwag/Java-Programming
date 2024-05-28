import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Number");
        int a=sc.nextInt();
        System.out.println("Enter Common Difference");
        int d=sc.nextInt();
        System.out.println("Enter Number of terms you want in AP");
        int n=sc.nextInt();
        int term=a;
        for (int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term+d;

        }
    }
}
