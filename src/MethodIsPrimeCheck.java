
public class MethodIsPrimeCheck {
    static boolean IsPrime(int n)
    {
        for (int i=2;i<n/2;i++)
        {
            if (i%10==0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(IsPrime(91));

    }
}
