public class checkdateformatregex {
    public static void main(String[] args) {
        String d= "05/09/2002";
        //System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[12][0-9][0-9][0-9]"));
        //System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")); //Doubt if month is 15 then
        System.out.println(d.matches("([0-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/[0-9]{4}")); // problem solved
    }
}
