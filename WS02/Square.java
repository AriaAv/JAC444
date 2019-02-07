package shapes;

public class Square extends Rectangle {

    public Square(double x) {
        super(x, x);

    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " {s=" + this.getX() + "} perimeter = " +
                this.perimeter() + "\n");
    }
}
