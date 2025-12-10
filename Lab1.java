import java.net.InetAddress;
import java.net.UnknownHostException;
public class Lab1{
    public static void main (String[] args){
        try{
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("Hostname:"+inetAddress.getHostName());
            System.out.println("Ip address:"+inetAddress.getHostAddress());
        }catch(UnknownHostException e){
            System.out.println("Cannot get Ip address");
            e.printStackTrace();
        }
    }
}
