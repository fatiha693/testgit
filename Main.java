import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        OrderedPrinter orderedPrinter = new OrderedPrinter();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.createShape("circle", 5.0));
        shapes.add(shapeFactory.createShape("rectangle", 4.0, 6.0));
        shapes.add(shapeFactory.createShape("square", 3.0));
        shapes.add(shapeFactory.createShape("circle", 2.0));
        shapes.add(shapeFactory.createShape("rectangle", 2.0, 3.0));
        shapes.add(shapeFactory.createShape("square", 5.0));
        shapes.add(shapeFactory.createShape("circle", 1.0));
        shapes.add(shapeFactory.createShape("rectangle", 10.0, 2.0));
        shapes.add(shapeFactory.createShape("square", 6.0));
        shapes.add(shapeFactory.createShape("circle", 3.0));

        orderedPrinter.printOrderedShapes(shapes);
    }
}
