public class Circle extends {

    private Point center;

    private int radius;

    public Circle(Point center) {
        super();
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public int area(){
        return super.area();
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            throw new IllegalArgumentException("Side A can't be negative");
        }else {
            this.radius = radius;

        }
    }
}
