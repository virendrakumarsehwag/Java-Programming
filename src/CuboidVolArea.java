import java.lang.*;
import java.util.*;
public class CuboidVolArea {
    public static void main(String[] args) {
        int l,b,h;
        int area,vol;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length Breadth and height ");
        l=sc.nextInt();
        b= sc.nextInt();;
        h=sc.nextInt();
        area=2*(l*b+b*h+h*l);
        vol=l*b*h;
        System.out.println("area= "+area);
        System.out.println("Volume= "+vol);

    }
}
