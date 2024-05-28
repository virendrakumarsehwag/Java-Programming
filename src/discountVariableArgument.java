public class discountVariableArgument {
    static double discount(double ...P)
    {
        double sum=0;
        for (int i=0;i<P.length;i++)
            sum+=P[i];
        if (sum<500)
            return sum*0.10;
        else if (sum>=500 && sum<1000)
            return sum*0.15;
        else
            return sum*0.20;
    }

    public static void main(String[] args) {
        System.out.println(discount());
        System.out.println(discount(400));
        System.out.println(discount(10,20));
        System.out.println(discount(10,20,30));
    }
}
