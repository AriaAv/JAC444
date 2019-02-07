package shapes;

public class Square implements Shape{

    double x;
    public Square(double x) throws Exception {
        if (!(x > 0.0))
            throw new WrongSideException();

    }
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    @Override
    public double perimeter(){
        return (getX()*4);
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " {s=" + this.getX() + "} perimeter = " +
                this.perimeter() + "\n");
    }
}