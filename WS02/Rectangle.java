package shapes;

public class Rectangle extends Circle{

    private double y;

    public Rectangle (double x, double y){
        super(x);
        setY(y);
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public double perimeter(){
        return (getX()+getY())*2;
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " {w=" + this.getX() + ", h=" + this.getY()
                + "} perimeter = " + this.perimeter() + "\n");
    }

}
