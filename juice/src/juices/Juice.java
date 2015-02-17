package juices;

import java.io.*;
import java.util.*;

/**
 * Created by ali09143914227 on 2/10/2015.
 */
public class Juice {
    private ArrayList<String> list = new ArrayList<String>();
    private static Set<String> set = new LinkedHashSet<String>();

    // for second part
    public static String getAllComponents(String string) {
        StringTokenizer stoke = new StringTokenizer(string, " \n");
        while (stoke.hasMoreElements())
            set.add(stoke.nextToken());
        System.out.println();
        return set.toString();
    }
    public static void separateThread (final ArrayList <String> array) throws IOException{

        Thread T = new Thread(new Runnable() {
            @Override
            public void run() {
                Collections.sort(array, new FruitComparator());
               System.out.println( "It is separate thread");
            }
        });
        T.start();
        do {
            try {
                T.join(130);
            } catch (InterruptedException e) {
            }
        } while (T.isAlive());
        String out2 = "output2.txt";
        BufferedWriter br = new BufferedWriter(new FileWriter(out2));
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            br.write(iterator.next() + " ");
        }
        br.close();
    }
    }








