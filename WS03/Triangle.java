package shapes;

public class Triangle extends Rectangle{

    private double z;

    public Triangle(double x, double y, double z) throws  Exception{
        super (x,y);
        if (!(z > 0.0)){
            throw new WrongSidesException();
        }
        setZ(z);
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double perimeter(){
        return getX()+getY()+getZ();
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + " {s1=" + this.getX() + ", s2=" + this.getY() +
                ", s3=" + this.getZ()+ "} perimeter = " + this.perimeter() + "\n");
    }
}
