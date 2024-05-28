interface Test
{
    void meth1();
    void meth2();

}
class Mi implements Test
{
    public void meth1()
    {
        System.out.println("Meth of class My");
    }
    public void meth2() {
        System.out.println("Meth of class My");
    }
    public void meth3()
    {
        System.out.println("Meth of class My");
    }
}
public class interfacepractise {
    public static void main(String[] args) {
        Test t=new Mi();
        t.meth1();
        t.meth2();



    }
}
