public class CreatingMethod {
    int max(int x,int y)
    {
        if (x>y)
            return x;
        else
            return y;

    }

    public static void main(String[] args) {
        int a=10,b=15;
        CreatingMethod cm=new CreatingMethod();
        System.out.println(cm.max(a,b));
    }
}
