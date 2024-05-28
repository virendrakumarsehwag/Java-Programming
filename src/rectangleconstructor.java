

class Rectangle1
{
    private double length;
    private double breadth;
    public Rectangle1()
    {
        length=1;
        breadth=1;
    }
    public Rectangle1(double l,double b)
    {
        length=l;
        breadth=b;
    }

    public Rectangle1(double s)
    {
        length=breadth=s;
    }
}
public class rectangleconstructor {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1();


    }
}
