import java.io.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import Tools.Toolbox;

public class Main{
        
    
    public static void main(String[] args) throws IOException {
        
        // Serialization = The process of converting an object into a byte stream
        // Persists (saves the state) the object after program exits
        // This byte stream can be saved as a file or sent over a network
        // Can be sent to a different machine
        // Byte stream can be saved as a file (.ser) which is platform independent
        // (Think of this as if you're saving a file with the objects's information)

        // Deserialization = The reverse process of converting a byte stream into an object.
        // (Think of this as if you're loading a saved file)







        User user = new User();

        user.name = "Bro";
        user.password = "I<3Pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved");




















        //Timer = A facility for threads to schedule tasks for future execution n a background thread.

        //TimerTAsk = A Task that can be scheduled for one-time or repeated execution by a timer


        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;
            @Override
            public void run(){
                if (counter>0){
                System.out.println("Task is complete !");
                counter--;
                }
                else{
                    System.out.println("Happy New Year!");
                    timer.cancel();

                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2023);
        date.set(Calendar.MONTH,Calendar.OCTOBER);
        date.set(Calendar.DAY_OF_MONTH,1);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE, 23);
        date.set(Calendar.SECOND, 0 );

       //timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000);

















       Toolbox toolbox = new Toolbox();
  
    }
}