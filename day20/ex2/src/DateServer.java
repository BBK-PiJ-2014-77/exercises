import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by digibrose on 09/03/2015.
 */
public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {
        //nothing to initialize;
    }


    @Override
    public Date Date() {
        Calendar date = new GregorianCalendar();
        return date.getTime();
    }
}
