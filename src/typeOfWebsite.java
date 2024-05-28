import java.util.Scanner;

public class typeOfWebsite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter domain:");
        String domain=sc.nextLine();
        int a=domain.indexOf(".");
        String ext=domain.substring(a+1);
        System.out.println(ext);
        switch (ext)
        {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Invalid Domain");
        }
    }
}
