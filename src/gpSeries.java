import java.util.Scanner;

public class gpSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Number");
        int a=sc.nextInt();
        System.out.println("Enter Common Ratio");
        int r=sc.nextInt();
        System.out.println("Enter Number of terms you want in GP");
        int n=sc.nextInt();
        int term=a;
        for (int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term*r;


        }
    }
}
