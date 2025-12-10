//Write a program to split URL

import java.net.*;

public class Lab11 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://bcanotesnepal.com/project-ii-details-bca-sixth-semester/");

        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Host     : " + url.getHost());
        System.out.println("Port     : " + url.getPort());
        System.out.println("Path     : " + url.getPath());
        System.out.println("File     : " + url.getFile());
        System.out.println("Query    : " + url.getQuery());
    }
}