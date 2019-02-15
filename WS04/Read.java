package WS45;

import java.io.*;

class Read {

    static void read(){

        try {
            FileInputStream fi = new FileInputStream(new File("Student.file"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Student st1 = (Student) oi.readObject();
            oi.close();
            fi.close();

            System.out.println(st1.toString());
        }

        catch (ClassNotFoundException  e){
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
}
