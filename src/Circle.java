public class Circle {
    private int PI;
    private int radius;

    public int getPI() {
        return PI;
    }

    public void setPI(int PI) {
        this.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void methodArea(int PI,int radius) {
        System.out.print("Ayanty: ");
        System.out.println(PI * (radius * radius));
    }

    public static void methodCircumference(int PI,int radius) {
        System.out.print("Radius: ");
        System.out.println(PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
