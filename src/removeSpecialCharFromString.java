public class removeSpecialCharFromString {
    public static void main(String[] args) {
        String str="a!B@c#1$2%3";
        String str1=str.replaceAll("\\W",""); // both of them are correct
        String str2=str.replaceAll("[^a-zA-Z0-9]",""); // both of them are correct
        System.out.println(str1);
        System.out.println(str2);
    }
}
