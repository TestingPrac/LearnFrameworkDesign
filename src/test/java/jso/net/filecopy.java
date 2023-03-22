package jso.net;
import java.io.File;
public class filecopy {




        public static void main(String[] args) {
//            File folder = new File("C:\\Users\\A710005\\Downloads\\NEST-Automation\\NEST-Automation\\src\\main\\java\\com\\cucumber\\framework\\utility");
            System.out.println("started");
            File folder = new File("C:\\Users\\a842074\\IdeaProjects\\Myfiles\\src\\test\\java");

            File[] listOfFiles = folder.listFiles();

            for (File file : listOfFiles) {
                if (file.isFile()) {
                    System.out.println("file name" + file.getName());
//                    System.out.println("file name"+file);
//                    System.out.println("file name"+file.toString());
//                }
                }
            }

        }}
