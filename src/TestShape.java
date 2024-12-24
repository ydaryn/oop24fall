import java.util.Vector;

public class TestShape {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();

        shapes.add(new Circle(2, Color.RED, 2));
        shapes.add(new Rectangle(0, Color.GREEN, 12, 6));
        shapes.add(new Triangle(0, Color.BLUE, 3));

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }
    }
}
