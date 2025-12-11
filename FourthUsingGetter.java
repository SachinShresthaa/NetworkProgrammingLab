import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.UnknownHostException;
public class FourthUsingGetter {
    private String ipAddress;   

    public FourthUsingGetter(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void checkIP() {
        String ip = getIpAddress();

        try {
            InetAddress address = InetAddress.getByName(ip);

            if (address instanceof Inet4Address) {
                System.out.println(ip + " is a valid IPv4 address.");
            } else if (address instanceof Inet6Address) {
                System.out.println(ip + " is a valid IPv6 address.");
            } else {
                System.out.println(ip + " is unknown IP address type.");
            }
        } catch (UnknownHostException e) {
            System.out.println(ip + " is an invalid IP address.");
        }
    }

    public static void main(String[] args) {
        FourthUsingGetter obj = new FourthUsingGetter("192.168.88.91"); 
        obj.checkIP();   
    }
}