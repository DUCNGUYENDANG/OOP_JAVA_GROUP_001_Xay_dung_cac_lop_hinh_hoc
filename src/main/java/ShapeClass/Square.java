package ShapeClass;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    public double getSide(){
        return getHeigth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setHeigth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setHeigth(double heigth) {
        super.setHeigth(heigth);
    }

    @Override
    public String toString() {
        return "SQUARE has:"
                + "\n   - side: "+getSide()
                + "\n   - area: "+getArea()
                + "\n   - perimeter: "+getPerimeter()+super.toString();
    }
}
