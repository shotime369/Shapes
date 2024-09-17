public class Square {
    private double Length = 0;

    public Square(double l1) {
        this.Length = l1;
    }

    public void setLength(double l1) {
        this.Length = l1;
    }

    public double getLength() {
        return Length;
    }

    public double getAreaS(){
        double areaS = Length * Length;
        System.out.println("Area of the square is: ");
        return areaS;
    }

    public double getPerimeterS(){
        double diameterS = Length * 4;
        System.out.println("Circumference of the square is: ");
        return diameterS;
    }

}
