import java.util.Scanner;

public class typeOfWebAndProtocolUsed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Url:");
        String url=sc.nextLine();
        int a=url.indexOf(":");
        String p=url.substring(0,a);
        if (p.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if (p.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else if (p.equals("https"))
        {
            System.out.println("Hyper Text Transfer Protocol Secure");
        }
        String ext=url.substring(url.lastIndexOf(".")+1);
        if (ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if (ext.equals("org"))
        {
            System.out.println("Organization");
        }
        else if (ext.equals("net"))
        {
            System.out.println("Network");
        }
    }
}
