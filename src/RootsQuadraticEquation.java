import java.util.*;
import java.lang.*;
public class RootsQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter values of a,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root are " + r1);
        System.out.println("Root are " + r2);

    }
}
