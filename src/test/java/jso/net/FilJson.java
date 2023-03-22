package jso.net;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilJson {
    public static void main(String[] args) throws IOException, ParseException {

        // new file create

      JSONObject object = new JSONObject();
        object.put("name", "hai");

        FileWriter fileWriter = new FileWriter("src/test/resources/api.json");

        fileWriter.write(object.toJSONString());
        fileWriter.close();
        System.out.println(object);


// Read file
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject.toJSONString());


//        String name = (String) jsonObject.get("caseTypeID");
//        System.out.println(name);
//        String course = (String) jsonObject.get("SchemeId");
//
//        JSONArray subjects = (JSONArray) jsonObject.get("ProposedResolution");
//
//        System.out.println("Name: " + course);
//        System.out.println("Course: " + subjects);


        // System.out.println("Subjects:");

            /*Iterator iterator = subjects.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/


        // WITHOUT OBJECT HEADER

       /* JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        jsonObject.put("EmployerID", "EMP-400668");
        FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();
//*/
//      JSONParser parser = new JSONParser();
//      FileReader fileReader = new FileReader("src/test/resources/api.json");
//      Object obj = parser.parse(fileReader);
//             JSONObject jsonObject = (JSONObject) obj;
//      jsonObject.put("EmployerID", "12345678");
//      FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
//              PrintWriter printContent= new PrintWriter(fileWriter);
//      printContent.write(jsonObject.toString());
//      printContent.close();
//            String payload=jsonObject.toString();
//      return payload;

        // WITH OBJECT HEADER

      /* JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject Obj = (JSONObject) jsonObject.get("BillingInformation");
        Obj.put("RefundAcctNumber", "5678www");
         FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
        fileWriter.write(jsonObject.toString());
        fileWriter.close();*/



     /* JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject Obj = (JSONObject) jsonObject;

        JSONArray array = new JSONArray();

        jsonObject.get("SchemeSetUp");
        Obj.put("TypeOfScheme", "siiimp");
        FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
        fileWriter.write(jsonObject.toString());
        fileWriter.close();*/


        //   }


    }
}
