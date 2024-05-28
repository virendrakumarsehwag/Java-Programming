public class FindingMaxElementInArray {
    static int max(int A[])
    {
        int B=A[0];
        for (int i=0;i<A.length;i++)
        {
            if (B<A[i])
                B=A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{56,87,53,97,54,38,82}));
    }

}
