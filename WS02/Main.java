package shapes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        System.out.println("------->JAC 444 Workshop 2&3<-------");
        System.out.println("------->Task 1 ... <-------");

        try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
            String s;
            int count = 0;
            Shape[] shapes = new Shape[33];
            while ((s = br.readLine()) != null) {
                String[] tokens = s.split(",");
                if (!(tokens.length < 2)) {
                    try {
                        count = populating(tokens,shapes,count);
                    }
                    catch (Throwable error) {
                        System.out.println(error.getMessage());
                    }
                }
            }
            System.out.println ( "\n" + count + " shapes were created:" );
            for (Shape j : shapes) {
                if (j != null) {
                    System.out.println(j.toString());
                }
            }
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int populating (String[] tokens, Shape[] shapes, int count) throws Throwable{
        switch (tokens[0]) {
            case "Circle": {

                if (check(Double.parseDouble(tokens[1])) | tokens.length != 2)
                    throw new Throwable("Invalid radius!");

                shapes[count] = new Circle(Double.parseDouble(tokens[1]));
                count++;
                break;
            }
            case "Square": {
                if (check(Double.parseDouble(tokens[1]))| tokens.length != 2)
                    throw new Throwable("Invalid side!");

                shapes[count] = new Square(Double.parseDouble(tokens[1]));
                count++;
                break;
            }
            case "Rectangle": {
                if (check(Double.parseDouble(tokens[1])) | check(Double.parseDouble(tokens[2]))| tokens.length != 3)
                    throw new Throwable("Invalid side(s)!");

                shapes[count] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]) );
                count++;
                break;
            }
            case "Parallelogram": {
                if (check(Double.parseDouble(tokens[1])) | check(Double.parseDouble(tokens[2])) | tokens.length != 3)
                    throw new Throwable("Invalid side(s)!");

                shapes[count] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                count++;
                break;
            }
            case "Triangle": {
                if (check(Double.parseDouble(tokens[1])) | check(Double.parseDouble(tokens[2]) ) |
                        check(Double.parseDouble(tokens[3]))| tokens.length != 4 |
                        (Double.parseDouble(tokens[1]) + Double.parseDouble(tokens[2])) <= Double.parseDouble(tokens[3]))
                    throw new Throwable("Invalid side(s)!");

                shapes[count] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                        Double.parseDouble(tokens[3]));
                count++;
                break;
            }
            default:
                break;
        }
        return count;
    }
    private static boolean check(double item){
        return !( item > 0.0);
    }
}
