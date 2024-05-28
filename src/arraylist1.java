public class arraylist1 {
    public static void main(String[] args) {
        String a="ccdfgh";
        for(int i=0;i<a.length()-1;i++)
        {
            if(a.charAt(i)==a.charAt(i+1))
            {
                System.out.println("Duplicate");
                break;

            }
            else
            {
                System.out.println("No Duplicate");
                break;
            }
        }
    }

}
