public class ShapeFactory {


public Shape createShape(String type,double x, double y, double... params){
    switch (type) {
        case "circle":
            return new Circle(x, y, params[0]);
        case "square":
            return new Square(x, y, params[0]);
        case "rectangle":
            return new Rectangle(x, y, params[0], params[1]);
        default:
            System.out.println("Unknown shape type");
    }

}
}
