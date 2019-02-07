package shapes;

public class Parallelogram extends Rectangle{

    public Parallelogram(double x, double y) throws Exception{
        super(x, y);
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " {w=" + this.getX() + ", h=" + this.getY()
                + "} perimeter = " + this.perimeter() + "\n");
    }
}
