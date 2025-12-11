// Write a program to retrieve MAC address providing an IP address

import java.net.*;
import java.util.*;

public class Lab8 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String inputIP = sc.nextLine();

        InetAddress ip = InetAddress.getByName(inputIP);
        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);

        if (ni == null) {
            System.out.println("No interface found for this IP!");
            return;
        }

        byte[] mac = ni.getHardwareAddress();
        if (mac == null) {
            System.out.println("MAC Address not available!");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (byte b : mac) {
        System.out.println("MAC Address: " + sb.substring(0, sb.length() - 1));
    }
}
