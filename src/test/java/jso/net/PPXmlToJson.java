package jso.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class PPXmlToJson {
    public static String data = "";
    public static String xml ="src/test/resources/aa.xml";
    public static void main(String[] args) throws Exception {


       /* JSONObject json = XML.toJSONObject(xml);
        String jsonString = json.toString(1);
        System.out.println(jsonString);*/
// Read the student.xml
         data = FileUtils.readFileToString(new File(xml), "UTF-8");
        // Create a new XmlMapper to read XML tags
        XmlMapper xmlMapper = new XmlMapper();

        //Reading the XML
        JsonNode jsonNode = xmlMapper.readTree(data.getBytes());

        //Create a new ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        String value = objectMapper.writeValueAsString(jsonNode);

        System.out.println("*** Converting XML to JSON ***");
        System.out.println(value);


    }
}
