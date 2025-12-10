import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.List;

public class ListNetworkInterface {
    public static void main(String[] args) {
        try{
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());

            System.out.println(":available network interfaces. ");
            for(NetworkInterface ni : interfaces) {
                System.out.println("-" + ni.getName() + "(" + ni.getDisplayName() + ")");
            }
        } catch (SocketException e) {
            System.out.println("error fetching network interfaces: " +e.getMessage());
        }
    }
}