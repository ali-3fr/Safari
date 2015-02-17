package juices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ali09143914227 on 2/10/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Juice juice = new Juice();
        String line =FileWorker.read("input.in");
        System.out.println(line);
        String [] strings = StringToStringArray.stringToArray(line);

        ArrayList <String> arrayList = new ArrayList<String>();
        for(String word :strings){
            arrayList.add(word);
        }
        String allComponents = Juice.getAllComponents(line);
        FileWorker.write("juice1.out", allComponents);

        StringBuilder sortedAllComponents =  new StringBuilder();
        Collections.sort(arrayList, new FruitComparator());
        for(String word : arrayList)
            sortedAllComponents.append(word).append(" ");
        FileWorker.write("juice2.out",sortedAllComponents.toString());
        Juice.separateThread(arrayList);


    }
}
