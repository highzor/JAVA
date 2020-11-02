import java.io.*;
import java.util.Map;
import java.util.TreeMap;

//Program arguments: Disk:\JAVA\examples\text1.txt

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> treeMap = new TreeMap<>();
        FileInputStream file1 = new FileInputStream(args[0]);
        while (file1.available() > 0) {
            int data = file1.read();
            byte ASCII = (byte) data;
            if (treeMap.get(ASCII) == null) {
                treeMap.put(ASCII, 1);
            } else {
                int value = treeMap.get(ASCII);
                value++;
                treeMap.put(ASCII, value);
            }
        }
        file1.close();
        for(Map.Entry<Byte, Integer> pair : treeMap.entrySet())
        {
            byte key = pair.getKey();
            char form = (char) key;
            System.out.println(form + " " + pair.getValue());
        }
    }
}
