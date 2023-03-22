package jso.net;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class symbol {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");

        Object obj = parser.parse(fileReader);

        JSONObject jsonObject = (JSONObject)obj;
        String name = (String)jsonObject.get("caseTypeID");
        String course = (String)jsonObject.get("serviceCaseReference");
        //JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        // System.out.println("Subjects:");

            /*Iterator iterator = subjects.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/
    }

}
