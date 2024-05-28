public class extraSpaceRegex {
    public static void main(String[] args) {
        String str="   abc  de      fgh    ijk   ";
        String str1=str.replaceAll("\\s+"," ");
        System.out.println(str1.trim());
    }
}
