// 13. Write a program to display the parts of URI.

import java.net.URI;
import java.net.URISyntaxException;

public class Lab13 {
    public static void main(String[] args) {
        try {
            String uriString = "https://example.com:8080/path/to/resource?name=gopal&age=30#section1";

            URI uri = new URI(uriString);

            System.out.println("URI: " + uriString);
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());
            System.out.println("User Info: " + uri.getUserInfo());
            System.out.println("Authority: " + uri.getAuthority());

        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}
