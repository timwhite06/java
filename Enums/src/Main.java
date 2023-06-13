// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(StudentType theStudent : StudentType.values()){
            System.out.println(theStudent.toString() + " = " + theStudent.getDescription());
        }
    }
}
