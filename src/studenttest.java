class student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if (average()>=60)
            return 'A';
        else
            return 'B';
    }
}
public class studenttest {
    public static void main(String[] args) {
        student s=new student();
        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;
        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println(s.grade());

    }
}
