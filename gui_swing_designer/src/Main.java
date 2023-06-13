import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        String jsonFile = "data/students.json";
        FileReader fileReader = new FileReader(jsonFile);
        JsonReader jsonReader = new JsonReader(fileReader);

        System.out.println(jsonReader);

        MapJson[] data = gson.fromJson(jsonReader, MapJson[].class);

        // iF YOU WANTED TO DO OAN ARRAY LIST
        ArrayList<Student> studentArrList = new ArrayList<>();

        for(MapJson json : data ) {
//            System.out.println(json.first_name + " " + json.last_name);

            studentArrList.add(new Student(json.first_name, json.last_name));
        }

        System.out.println(studentArrList.get(20).getStudentFirstName());
        System.out.println(studentArrList.get(20).getStudentLastName());


//        Student obj = new Student("Tim", "White");
//        System.out.println(obj.getStudentFirstName());
//        System.out.println(obj.getStudentLastName());
//
//        JFrame mainFrame = new JFrame("My App");
//        mainFrame.setContentPane(new App().mainPanel);
//
//        mainFrame.setSize(400 , 200);
//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        mainFrame.setVisible(true);
    }
}
