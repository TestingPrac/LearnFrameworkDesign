package jso.net;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class jJJJ {
    public static void getCurrentDateSCM(String dateFormate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormate);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now).toString());
//2023-02-28
    }
    public static void main(String[] args) throws Exception {

      jJJJ.getCurrentDateSCM("yyyy-MM-dd");

    }
        // new file create

     /*JSONObject object = new JSONObject();
        object.put("name", "hai");


        FileWriter fileWriter = new FileWriter("src/test/resources/api.json");

        fileWriter.write(object.toJSONString());
        fileWriter.close();
        System.out.println(object);*/

// Read file
    /*    JSONParser parser = new JSONParser();
       FileReader fileReader = new FileReader("src/test/resources/api.json");
            Object obj = parser.parse(fileReader);
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            String course = (String)jsonObject.get("course");
            //JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);
             // System.out.println("Subjects:");
          *//*  Iterator iterator = subjects.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());*//*
            }*/

    //File file = new File(file_path_xml);
//        FileInputStream stream = new FileInputStream(file);
//        requestBody = IOUtils.toString(stream,"ISO-8859-1");
//        response = apiLib.prepareResponseSCM(functionality, requestBody, requestType, endPoint);
//        System.out.println( response.getStatusCode());
    }
