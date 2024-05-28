public class RegularExp {
    public static void main(String[] args) {
        //String str1="f";
        //String str1="a";
        //System.out.println(str1.matches("\\D"));
        //String str1="joh-n@gmail.com";
        //System.out.println(str1.matches("\\w*@gmail(.*)"));
        String str1 = "programmer@gmail.com";
        int i=str1.indexOf("@");
        System.out.println(i);
        System.out.println("username is "+str1.substring(0,i));
        System.out.println("Domain is  "+str1.substring(i+1,str1.length()));
        System.out.println(str1.indexOf("."));

        //System.out.println(str1.matches(".*gmail.*"));
        //System.out.println(str1.matches(".*"));
    }
}
