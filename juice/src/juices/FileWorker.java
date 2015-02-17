package juices;

import java.io.*;

/**
 * Created by ali09143914227 on 2/10/2015.
 */
public class FileWorker {
    private static void exists(String fileName ) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists())
            throw new FileNotFoundException(file.getName());
    }
    public static void write ( String fileName , String inputText){
        File file = new File (fileName);
        try {
            if (!file.exists())
                file.createNewFile();
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            try{

                out.println(inputText);

            }finally {
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
    public static String read (String fileName){
        File file = new File (fileName);
        StringBuilder sb = new StringBuilder();
        try {
            if (!file.exists())
                file.createNewFile();
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try{
                String string;
                while ((string = in.readLine())!= null){
                    sb.append(string);
                    sb.append("\n");
                }
            }finally {
                in.close();
            }
        }catch (IOException  e){
            throw new RuntimeException();
        }
        return sb.toString();
    }
}
