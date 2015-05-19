import java.net.MalformedURLException;
import java.rmi.*;

/**
 * Created by digibrose on 09/03/2015.
 */
public class EchoClient {

    public static void main (String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
// 1. If there is no security manager, start one
   //     if (System.getSecurityManager() == null) {
   //         System.setSecurityManager(new RMISecurityManager());
   //     }
        Remote service = null;
        try {
            service = Naming.lookup("//localhost:1099/echo");
        } catch (NotBoundException e) {
            e.printStackTrace();
            System.out.println("1");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("2");
        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("3");
        }
        EchoService echoService = (EchoService) service;

        try {
            String receivedEcho = echoService.echo(args[0]);
            System.out.println(receivedEcho);
        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("4");
        }
    }
}
