public class Circle {
    private double Radius = 0;

    public Circle(double r1) {
        this.Radius = r1;
    }

    public void setRadius(double r1) {
        this.Radius = r1;
    }

    public double getRadius() {
        return Radius;
    }

    public double getArea(){
       double area = Math.PI * Radius * Radius;
       System.out.println("Area of the circle is: ");
       return area;
    }

    public double getPerimeter(){
    double circumference = 2 * Math.PI * Radius;
    System.out.println("Circumference of the circle is: ");
    return circumference;
   }
}
