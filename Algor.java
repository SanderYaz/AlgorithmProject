import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Algor {   
    public static HashMap<String, String> map = new HashMap<String, String>();

    public static void main(final String[] args){
        final LinkedList<String> list = new LinkedList<String>();       
        Scanner input;
        final File file = new File ("arr2.txt");
        try{
        input = new Scanner(file);
        while (input.hasNext()) {
            list.add(input.next());
        }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        try {
            final BufferedReader reader = new BufferedReader(new FileReader("arr.txt"));
            String line;
            int lineNumber = 0;
            long start = System.currentTimeMillis();
            while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    final String[] values = line.split(" ");
                    final String strline = Integer.toString(lineNumber);
                    map.put(values[0], strline);
                    if (!list.contains(values[0])){
                        System.out.println(strline);
                    }
                }

                long finish = System.currentTimeMillis();
                    System.out.println("it running time " + (finish - start) + " ms");
                    
        }       catch (final IOException e) {
            e.printStackTrace();
        }
    }
}