public class EmailcheckString {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String Domain=str.substring(i+1,str.length());
        System.out.println("Username= "+uname);
        System.out.println("Domain= "+Domain);
        int j=Domain.indexOf(".");
        String n=Domain.substring(0,j);
        System.out.println(n.equals("gmail"));
        System.out.println(Domain.startsWith("gmail"));



    }
}
