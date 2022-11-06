import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvToJson {

    public static void main(String[] args) {
        String path = "C:\\Users\\HP\\IdeaProjects\\HNGBIDDING\\src\\main\\java\\hng.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                for (int i = 0; i < value.length; i++) {

                    System.out.print("Series number: " +value[1]
                    + " Filename: " + value[2] + " Name: " + value[3]
                    + " Description: " + value[4]
                    + " Gender: " + value[5]
//                    + " Attributes: " + value[6]
                    + " uuid: " + value[7] + "  ");

                    String[] attributes = value[6].split(";");
                    for (String d: attributes) {
                        System.out.println(d);
                    }

                }
                System.out.println("");
//                System.out.println(value.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}