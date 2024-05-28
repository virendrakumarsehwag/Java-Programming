import java.util.Scanner;

public class menuDrivenForArithmaticOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("Sub");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter 2 numbers:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words ");
        String o=sc.nextLine();
        switch (o)
        {
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "Div":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
