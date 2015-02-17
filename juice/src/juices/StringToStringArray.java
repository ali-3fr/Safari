package juices;

import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * Created by ali09143914227 on 2/10/2015.
 */
public class StringToStringArray {
    public static String [] stringToArray (String string){
        StringTokenizer stoke = new StringTokenizer(string , " \n");
        ArrayList<String> arrayList = new ArrayList <String>();
        while (stoke.hasMoreElements()) {
            arrayList.add(stoke.nextToken());
        }
        String [] strings = new String[arrayList.size()];
        for (int i = 0 ; i < arrayList.size() ; i++){
            strings [i] = arrayList.get(i);
        }
        return strings;
    }
}
