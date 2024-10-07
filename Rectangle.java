public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(double x, double y, double length, double width){
        super(x,y);
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea(){

        return length*width;

    }
    @Override
    public void draw(){
        System.out.println("Drawing rectangle from " + x + "," + y + "coordinates");
    }

}
