import java.io.*;

public class CopyText {
    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("Hello.txt");
//            writer.write("helodsds");
//            writer.write("helodsd53135s");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            File inFile = new File("file/Hello.txt");
            FileReader fileReader = new FileReader(inFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
