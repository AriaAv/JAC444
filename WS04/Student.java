package WS45;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{

    private int stdID;
    private String firstName;
    private String lastName;
    private java.util.ArrayList courses;

    Student(int stdID,String firstName, String lastName,ArrayList courses){
        setFirstName(firstName);
        setLastName(lastName);
        setStdID(stdID);
        setCourses(courses);
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setStdID(int stdID) {
        this.stdID = stdID;
    }

    private void setCourses(ArrayList courses) {
        this.courses = courses;
    }

    private int getStdID() {
        return stdID;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private ArrayList getCourses() {
        return courses;
    }

    @Override
    public String toString(){
        return "Student ID: " + getStdID() +
                "  First Name: " + getFirstName() +
                "  Last Name: " + getLastName() +
                "  Courses: " + getCourses();
    }
}
