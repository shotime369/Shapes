//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(25);
        Circle c3 = new Circle(125);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());

        System.out.println(c1.getPerimeter());
        System.out.println(c2.getPerimeter());
        System.out.println(c3.getPerimeter());

        Square s1 = new Square(5);
        System.out.println(s1.getAreaS());
        System.out.println(s1.getPerimeterS());

        Rectangle r1 = new Rectangle(5,6);
        System.out.println(r1.getAreaR());
        System.out.println(r1.getPerimeterR());
        }
    }
    ////
