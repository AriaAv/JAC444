package shapes;

public class Rectangle implements Shape{

    private double y;
    private double x;

    public Rectangle (double x, double y) throws  Exception{
        if (!(x > 0.0) | !(y > 0.0))
            throw new WrongSidesException();
        setY(y);
        setX(x);
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
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
