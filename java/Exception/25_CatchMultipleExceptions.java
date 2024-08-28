import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main
 {
    public static void main(String[] args) {
        String filename = "readme.txt";

        try {
                 BufferedReader reader = new BufferedReader(new FileReader(filename));
                 String line;
                
                 while ((line = reader.readLine()) != null) {
                   System.out.println(line);
                }
 
            reader.close();

        } 
      catch(IOException | SecurityException ex) 
       {
            ex.printStackTrace();
       }
    }
}