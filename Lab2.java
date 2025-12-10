import java.net.InetAddress;
import java.net.UnknownHostException;
public class Lab2{
    public static void main(String[] args){
      try{
          InetAddress inet = InetAddress.getLocalHost();
          System.out.println("Host Name :"+ inet.getHostName());
          System.out.println("Host Address :"+ inet.getHostAddress());
          System.out.println("Canonical Host :"+ inet.getCanonicalHostName());
          System.out.println("Is Loopback :"+ inet.isLoopbackAddress());
          System.out.println("Is Reachable :"+ inet.isReachable( 2000));
          System.out.println("Is Multicast :"+ inet.isMulticastAddress());
      } catch(UnknownHostException e){
          System.out.println( "Error: Unknown Host");
          e.printStackTrace();
        }catch(Exception e){
          System.out.println("Error occurrred");
          e.printStackTrace();
      }
    }
}
