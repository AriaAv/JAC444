package shapes;

public class Circle implements Shape{

    private double x;

    public Circle (double x){
        setRadius(x);
    }

    public void setRadius(double radius) {
        this.x = radius;
    }

    public double getX() {
        return x;
    }

    @Override
    public double perimeter(){
        return (3.14159265359*getX())*2;
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " {r=" + this.getX() + "} perimeter = " +
               this.perimeter() + "\n");
    }
}
