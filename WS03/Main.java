package shapes;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
            String s;
            int count = 0;
            Shape[] shapes = new Shape[33];

            System.out.println("------->JAC 444 Workshop 2&3<-------");
            System.out.println("------->Task 1 ... <-------");
            
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");
                if (!(tokens.length < 2)) {

                    try {
                        count = populating(tokens,shapes,count);
                    }
                    catch (Exception error) {
                        System.out.println(error.getMessage());
                    }
                }
            }
            System.out.println ( "\n" + count + " shapes were created:" );
            print(shapes);

            System.out.println("------->Task 2 ... <-------");

            remove(shapes);
            print(shapes);

            System.out.println("------->Task 3 ... <-------");
            total(shapes);
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int populating (String[] tokens, Shape[] shapes, int count) throws Exception{
        switch (tokens[0]) {
            case "Circle": {

                if (tokens.length != 2)
                    throw new WrongRadiusException();
                try {
                    shapes[count] = new Circle(Double.parseDouble(tokens[1]));
                }
                finally {
                    count++;
                }
                break;
            }
            case "Square": {
                if (tokens.length != 2)
                    throw new WrongSideException();
                try {
                    shapes[count] = new Square(Double.parseDouble(tokens[1]));
                }
                finally {
                    count++;
                }
                break;
            }
            case "Rectangle": {
                if (tokens.length != 3)
                    throw new WrongSidesException();

                try {
                    shapes[count] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]) );
                }
                finally {
                    count++;
                }
                break;
            }
            case "Parallelogram": {
                if (tokens.length != 3)
                    throw new WrongSidesException();
                try {
                    shapes[count] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                }
                finally {
                    count++;
                }
                break;
            }
            case "Triangle": {
                if (tokens.length != 4 |
                        (Double.parseDouble(tokens[1]) + Double.parseDouble(tokens[2])) <= Double.parseDouble(tokens[3]))
                    throw new WrongSidesException();
                try {
                    shapes[count] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                            Double.parseDouble(tokens[3]));
                }
                finally {
                    count++;
                }
                break;
            }
            default:
                break;
        }
        return count;
    }

    private static void print (Shape[] shapes){
        for (Shape j : shapes) {
            if (j != null && j.perimeter() != 0.0) {
                System.out.println(j.toString());
            }
        }
    }

    private static void remove (Shape[] shapes) {
        double maxCircle = Double.MIN_VALUE;
        double minTriangle = Double.MAX_VALUE;
        for (Shape j : shapes) {
            if (j != null) {
                if (j instanceof Triangle) {
                    if (minTriangle > j.perimeter())
                        minTriangle = j.perimeter();
                }
                if (j instanceof Circle){
                    if (maxCircle < j.perimeter())
                        maxCircle = j.perimeter();
                }
            }
        }
        for (Shape j : shapes) {
            if (j != null) {
                if (j instanceof Triangle) {
                    if (minTriangle == j.perimeter()) {
                        ((Triangle) j).setZ(0.0);
                        ((Triangle) j).setY(0.0);
                        ((Triangle) j).setX(0.0);
                    }
                }
                if (j instanceof Circle){
                    if (maxCircle == j.perimeter()) {
                        ((Circle) j).setRadius(0.0);
                    }
                }
            }
        }
    }

    private static void total (Shape[] shapes){
        double totaltri = 0.0;
        double totalpara = 0.0;
        for (Shape j : shapes) {
            if (j != null) {
                if (j instanceof Triangle) {
                    totaltri += j.perimeter();
                }
                if (j instanceof Parallelogram) {
                    totalpara += j.perimeter();
                }
            }
        }
        System.out.println("Total perimeter of Parallelogram is: " + totalpara);
        System.out.println("Total perimeter of Triangle is: " + totaltri);
    }
}
