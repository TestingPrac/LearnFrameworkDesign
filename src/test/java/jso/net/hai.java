package jso.net;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class hai {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        jsonObject.put("EmployerID", "765432");
        FileWriter fileWriter = new FileWriter("src/test/resources/api.json", false);
        PrintWriter printContent = new PrintWriter(fileWriter);
        printContent.write(jsonObject.toString());
        printContent.close();


    }
}
