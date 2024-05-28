class cylinder {
    public double radius;
    public double height;

    public double lidarea() {
        return Math.PI * radius * radius;

    }

    public double totalsurfacearea() {
        return 2 * lidarea() + circumference() * height;


    }

    public double circumference() {
        return 2 * Math.PI * radius;

    }

    public double volume() {
        return lidarea() * height;
    }
}

public class cylindertest {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println(c.lidarea());
        System.out.println(c.totalsurfacearea());
        System.out.println(c.volume());
        System.out.println(c.circumference());

    }
}
