package juices;

import java.util.Comparator;

/**
 * Created by ali09143914227 on 2/10/2015.
 */
public class FruitComparator implements Comparator <String> {
    public int compare (String string1,String string2){
        return string1.compareTo(string2);
    }

}
