class rectangle
{
    private double length;
    private double breadth;
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}
public class rectangleoops {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.setLength(10.5);
        r1.setBreadth(5.5);
        //r1.length=10.5;
        //r1.breadth=10.5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());


    }
}
