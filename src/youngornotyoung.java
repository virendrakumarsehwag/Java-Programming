import java.util.Scanner;

public class youngornotyoung {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Age");
        age=sc.nextInt();
        if (age>=14 && age<=55){
            System.out.println("Young");
        }
        else {
            System.out.println("Not Young");
        }
    }
}
