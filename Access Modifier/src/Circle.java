public class Circle {
    double radius = 1;
    String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    private Circle(double radius){
        this.radius = radius;
    }
    private double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

}
