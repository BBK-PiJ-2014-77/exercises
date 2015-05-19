import java.util.TimerTask;
import java.util.concurrent.Executor;

/**
 * Created by digibrose on 23/02/2015.
 */
public class TimedTask implements Runnable {

    private int Time;


    public TimedTask(int time){
        if (time < 1000) {
            this.Time = time;
        }
        else {
            this.Time = 1000;
        }
    }


    @Override
    public void run() {
        try {
            Thread.sleep(Time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getTime(){
        return this.Time;
    }

    public static void main(String[] args ){

        SimpleEx t = new SimpleEx(2);
        for (int i = 0; i < 100; i++) {
            Runnable r = new TimedTask(100);
            t.execute(r);
            System.out.println(t.GetMaxPendingTime());
        }
        Runnable s = new TextLoop("test");
        t.execute(s);
        System.out.println(t.GetMaxPendingTime() + "Text");
    }
}
