package ShapeClass;

public class Shape {
    String color = "RED";
    boolean isFilled = true;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public String toString(){
        return " This Shape has:"
                + "\n          . color:"+getColor()
                + "\n          . status"+(isFilled()?" Filled": " No Filled");
    }
}
