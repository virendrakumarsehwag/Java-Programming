public class methodOverloading {
    static int max(byte x,byte y)
    {
        return x>y?x:y;

    }
    static int max(int x,int y,int z)
    {
        if (x>y)
            return x;
        else if (y>z)
            return y;
        else
            return z;
    }
    static float max(float x,float y)
    {
        if (x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {

        System.out.println(max(10,5,15));
    }

}
