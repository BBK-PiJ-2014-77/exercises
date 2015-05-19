import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * Created by digibrose on 09/03/2015.
 */
public class DateClient {

    public static void main (String[] args) {
        launch();
    }

    private static void launch() {
// 1. If there is no security manager, start one
        //     if (System.getSecurityManager() == null) {
        //         System.setSecurityManager(new RMISecurityManager());
        //     }
        Remote service = null;
        try {
            service = Naming.lookup("//localhost:1099/date");
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
        DateService dateService = (DateService) service;

        try {
            Date receivedDate = dateService.Date();
            System.out.println(receivedDate);
        } catch (RemoteException e) {
            e.printStackTrace();
            System.out.println("4");
        }
    }


}
