public class Triangle extends Shape{
    private int sideA,sideB,getSideC;

    public Triangle(Point location, int sideA, int sideB, int getSideC) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
        setGetSideC(getSideC);
    }

    public int getGetSideC() {
        return getSideC;
    }

    public void setGetSideC(int getSideC) {
        this.getSideC = getSideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            throw new IllegalArgumentException("Side A can't be negative!");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            throw new IllegalArgumentException("Side B can't be negative!");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public double perimeter(){
        return getSideC +sideA + sideB;
    }
    @Override
    public double area(){
        int i = (sideA * sideB)/2;
        return i;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", location=" + this.getLocation() +
                "sideB=" + this.sideB +
                ", sideA=" + this.sideA +
                '}';
    }
}