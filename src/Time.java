import java.util.Timer;
import java.util.TimerTask;

public class Time {

    /* Schedules an annoying beep every 5 seconds to keep us awake7
     @param args */

         public static void time(int millisekunden, Reaction reaction) {
             TimerTask action = new TimerTask() {

                 public void run() {
                     System.out.printf("Time - Zeit abgelaufen!\n");
                     reaction.reaction();

                 }

             };

             Timer caretaker = new Timer();

             caretaker.schedule(action, 1000, millisekunden);

         }
        }


