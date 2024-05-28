public class switchcase {
    public static void main(String[] args) {
        /* if (n==1)
        {
            System.out.println("One");
        }
        else if (n==2)
        {
            System.out.println("Two");
        }
        else if (n==3)
        {
            System.out.println("Three");
        }
        else
        {
            System.out.println("Not Valid Number");
        }
         */
        int n=3;
        switch (n)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
