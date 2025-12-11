import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class Lab15 {
    // Run main | Debug main | Run | Debug
    public static void main(String[] args) {
        try {
            String encoded = "https%3A%2F%2Fwww.facebook.com%2Fhome";
            String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8.toString());

            System.out.println("Encoded: " + encoded);
            System.out.println("Decoded: " + decoded);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}