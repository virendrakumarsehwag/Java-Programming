import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class findgradesforgivenmarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 subject Marks");
        int m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int total=m1+m2+m3;
        int avg=(m1+m2+m3)/3;
        System.out.println(avg);
        if (avg>=70){
            System.out.println("Grade A");
        }
        else if (avg>=60 && avg<70) {
            System.out.println("Grade B");

        }
        else if (avg>=50 && avg<60){
            System.out.println("Grade C");
        }
        else if (avg>=40 && avg<60) {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");

        }
    }
}
