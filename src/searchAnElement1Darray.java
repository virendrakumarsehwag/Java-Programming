import java.util.Scanner;

public class searchAnElement1Darray {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Key To be searched");
        int k=sc.nextInt();
        for (int i=0;i<A.length;i++)
        {
            if (A[i]==k)
            {
                System.out.println("Element Found At Index:"+i);
                System.exit(0);
            }
        }
        System.out.println("Key Not Found ");

    }
}
