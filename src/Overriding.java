class Super
{
    public void display()
    {
        System.out.println("Super Class Display");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub class Display");
    }
}

public class Overriding {
    public static void main(String[] args) {
        //Super sup=new Super();
        //sup.display();

        Super s=new Sub();
        s.display();


    }
}
