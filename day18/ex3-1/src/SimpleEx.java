import java.util.LinkedList;
import java.util.concurrent.Executor;

/**
 * Created by digibrose on 23/02/2015.
 */
public class SimpleEx implements Executor {

    JobList ExList;

    public SimpleEx(int i) {

        ExList = new JobList();

        for (int j = 0; j < i; j++) {
            Thread t = new Thread(ExList);
            t.start();
        }
    }

    @Override
    public void execute(Runnable t) {

        this.ExList.add(t);

    }

    public int GetMaxPendingTime() {
        int max = 0;
        int num;
        for (int i = 0; i < ExList.Jobs.size(); i++) {
               try {
            TimedTask t = (TimedTask) this.ExList.Jobs.get(i);
            num = t.getTime();
               }catch(ClassCastException e){
                   num = 1000;
               }
            max = max + num;
        }

            return max;
        }
    }
