import java.util.Scanner;

public class radixOfNumInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num");
        String num=sc.nextLine();
        if (num.matches("[01]+"))
        {
            System.out.println("Number Is Binary Radix is 2");
        }
        else if (num.matches("[0-7]+"))
        {
            System.out.println("Number is Octal Radix is 8");
        }
        else if (num.matches("[0-9]+"))
        {
            System.out.println("Number is decimal Radix is 10");
        }
        else if (num.matches("[0-9A-F]+"))
        {
            System.out.println("Number is hexadecimal Radix is 16");
        }
        else
        {
            System.out.println("Invalid Number");
        }



    }
}
