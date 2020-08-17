import java.io.*;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        try {
            String line = "";
            String csvSplitBy = ",";
            File csvFile = new File("Text\\text.txt");
            FileReader file = new FileReader(csvFile);
            BufferedReader buf = new BufferedReader(file);
            while ((line = buf.readLine()) != null) {
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [Code= "+country[4]+", name= "+country[5]+"]");
            }

        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
