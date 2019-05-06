
import java.io.*;
import java.util.*;

public class Sort {

    public static void main(String[] args) throws Exception {

        System.out.println("File path to read file: " + args[0]);
        System.out.println("File path to write file: " + args[1] + "\n");

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, String> map = new TreeMap<String, String>();
        String line = "";

        while ((line = reader.readLine()) != null) {
            map.put(getField(line), line);
        }
        reader.close();

        FileWriter writer = new FileWriter(args[1]);

        List<Integer> numbers = new ArrayList<Integer>();

        for (String val : map.values()) {
            if (Integer.parseInt(val) == (int) Integer.parseInt(val)) {
                numbers.add(Integer.parseInt(val));
            }
        }

        Collections.sort(numbers);

        for (Integer val : numbers) {
            writer.write(val.toString());
            writer.write("\r\n");
        }

        writer.close();
    }

    private static String getField(String line) {
        return line.split(" ")[0];//extract value you want to sort on
    }
}