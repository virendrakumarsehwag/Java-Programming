public class checkbinarystring {
    public static void main(String[] args) {
        int b=10110001;
        String str = b+"";
        System.out.println(str);
        System.out.println(str.matches("[01]*"));
    }

}
