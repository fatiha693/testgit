public class Circle extends Shape{

    protected double radius;

    public Circle (double x, double y, double radius){
        super(x,y);
        this.radius=radius;
    }



    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing circle from " + x + "," + y + "coordinates");
    }


}
