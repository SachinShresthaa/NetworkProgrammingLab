import java.net.*;
import java.io.*;

public class lab23 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com/");
            URLConnection conn = url.openConnection();

        
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.setRequestProperty("User-Agent", "MyJavaBrowser");
            conn.setDoInput(true);
            conn.setDoOutput(false);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}