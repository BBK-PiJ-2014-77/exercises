import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by digibrose on 09/03/2015.
 */
public interface DateService extends Remote {

    /**
     * Returns the calender date and time
     */

    public Date Date() throws RemoteException;



}
