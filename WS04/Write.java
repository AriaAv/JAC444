package WS45;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Write {

    static void write(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student ID: ");
            String input = scanner.nextLine();
            int id = Integer.parseInt(input);
            System.out.print("Enter Student first name: ");
            String fName = scanner.nextLine();
            System.out.print("Enter Student last name: ");
            String lName = scanner.nextLine();
            System.out.print("Enter Student courses (use ',' as a separator): ");
            ArrayList<String> courses = new ArrayList<>();
            String s = scanner.nextLine();
            String[] c = s.split(",");
            for (int i = 0; i < c.length; i++)
                courses.add(c[i]);

            Student s1 = new Student(id,fName,lName, courses);

            FileOutputStream f = new FileOutputStream(new File("Student.file"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(s1);
            o.close();
            f.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException n){
            System.out.println("Wrong input");
        }
    }
}
