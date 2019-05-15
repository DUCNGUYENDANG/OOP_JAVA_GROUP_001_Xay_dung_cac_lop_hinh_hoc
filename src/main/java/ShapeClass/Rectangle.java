package ShapeClass;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double heigth = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean isFilled, double width, double heigth) {
        super(color, isFilled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getArea(){
        return this.heigth*this.width;
    }
    public double getPerimeter(){
        return (this.heigth+this.width)*2;
    }

    @Override
    public String toString() {
        return "RECTANGLE has:"
                + "\n  - width: "+getWidth()
                + "\n  - heigth: "+getHeigth()
                + "\n  - area: "+getArea()
                + "\n  - perimeter: "+getPerimeter()+super.toString();
    }
}
