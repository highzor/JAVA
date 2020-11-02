import java.io.*;
import java.util.ArrayList;

/* 
Update/Delete Table
*/

public class Solution {
    public static void main(String[] args) throws  Exception {
        if (args.length == 0) return;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        if (args[0].equals("-u")) {
            updateLine(args, filePath);
        } else if (args[0].equals("-d")) {
            deleteLine(args, filePath);
        }
    }
    public static void updateLine(String[] args, String filePath) throws Exception {
        ArrayList<String> list = getFileLines(filePath);
        try (FileWriter fw = new FileWriter(filePath)) {
            for (String l : list) {
                if (l.substring(0, 8).trim().equals(args[1])) {
                    fw.write(String.format("%-8d%-30.30s%-8.8s%-4.4s\n", Integer.parseInt(args[1]), args[2], args[3], args[4]));
                } else {
                    fw.write(l + "\n");
                }
            }
        }
    }
    public static void deleteLine(String[] args, String filePath) throws Exception {
        ArrayList<String> list = getFileLines(filePath);
        try (FileWriter fw = new FileWriter(filePath)) {
            for (String l : list) {
                if (l.substring(0, 8).trim().equals(args[1])) {
                } else {
                    fw.write(l + "\n");
                }
            }
        }
    }
    public static ArrayList<String> getFileLines(String filePath) throws Exception {
        ArrayList<String> list = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
           String line;
           while ((line = br.readLine()) != null) {
               list.add(line);
           }
       }
        return list;
    }
}
