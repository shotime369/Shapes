public class Rectangle {
    private double Length = 0;
    private double Width = 0;

    public Rectangle(double l1, double l2) {
        this.Length = l1;
        this.Width = l2;
    }

    public void setLength(double l1) {
        this.Length = l1;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    public double getAreaR(){
        double areaR = Length * Width;
        System.out.println("Area of the rectangle is: ");
        return areaR;
    }

    public double getPerimeterR(){
        double diameterR = Length * 2 + Width * 2;
        System.out.println("Circumference of the rectangle is: ");
        return diameterR;
    }
}
