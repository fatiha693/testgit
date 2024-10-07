import java.util.List;

public class OrderedPrinter {
    public void printOrderedShapes(List<Shape> shapes) {
        shapes.sort((shape1, shape2) -> {
            int areaComparison = Double.compare(shape1.calculateArea(), shape2.calculateArea());
            if (areaComparison != 0) {
                return areaComparison;
            }
            int xComparison = Double.compare(shape1.getX(), shape2.getX());
            if (xComparison != 0) {
                return xComparison;
            }
            return Double.compare(shape1.getY(), shape2.getY());
        });

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}






