/**
 * Class defines a student
 */

// Importing my interface package 'Studentable'
import interfaces.Studentable;

public class Student implements Studentable {
    private String studentFirstName;
    private String studentLastName;
    public Student(String firstName, String lastName){
        studentFirstName = firstName;
        studentLastName = lastName;
    }
    @Override
    public String getStudentFirstName() {
        return studentFirstName;
    }

    @Override
    public String getStudentLastName() {
        return studentLastName;
    }
}
