package jso.net;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UApijson {
    public static void main(String[] args) throws Exception {


            Calendar calendar = Calendar.getInstance();
            Date today = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, -180);
            Date tomorrow = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String strDate= formatter.format(tomorrow);
        System.out.println(strDate);

    // new file create

     /* JSONObject object = new JSONObject();
        object.put("name", "hai");


        FileWriter fileWriter = new FileWriter("src/test/resources/api.json");

        fileWriter.write(object.toJSONString());
        fileWriter.close();
        System.out.println(object);*/


/*
// Read file
        JSONParser parser = new JSONParser();
       FileReader fileReader = new FileReader("src/test/resources/api.json");

            Object obj = parser.parse(fileReader);

            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            String course = (String)jsonObject.get("course");
            //JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);*/
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
*/
   /* JSONParser parser = new JSONParser();
    FileReader fileReader = new FileReader("src/test/resources/api.json");
    Object obj = parser.parse(fileReader);
    JSONObject jsonObject = (JSONObject) obj;
      jsonObject.put("EmployerID", "12345678");
    FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
    PrintWriter printContent= new PrintWriter(fileWriter);
      printContent.write(jsonObject.toString());
      printContent.close();
    String payload=jsonObject.toString();
      return payload;*/

    // WITH OBJECT HEADER

        /*JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject Obj = (JSONObject) jsonObject.get("content");
        Obj.put("ComplainantType", "5678www");
         FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
        fileWriter.write(jsonObject.toString());
        fileWriter.close();*/



       /* public String getFullNameFromXml(String response, String parent_tag, String tag_name) throws Exception {
            DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(response));
            Document xmlDoc = db.parse(is);
// NodeList nodeList = xmlDoc.getElementsByTagName(tagName);
            NodeList list =xmlDoc.getElementsByTagName(parent_tag);
            String data_in_xml = null;
            for (int i=0 ;i< list.getLength();i++)
            {
                Node node=list.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element =(Element) node;
                    data_in_xml = element.getElementsByTagName(tag_name).item(0).getTextContent(); }
            }
            return data_in_xml; }*/


     /*JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader("src/test/resources/api.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        JSONObject Obj = (JSONObject) jsonObject;
        JSONArray array = new JSONArray();
        jsonObject.get("SchemeSetUp");
        Obj.put("TypeOfScheme", "swefgniimp");
        FileWriter fileWriter = new FileWriter("src/test/resources/api.json");
        fileWriter.write(jsonObject.toString());
        fileWriter.close();*/



}
}
