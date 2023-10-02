public class MainThread {
    
    public static void main(String[] args) throws InterruptedException {
        
         // Threads = A thread of execution is a program (kind of like a virtual CPU)
        //The JVM allows an application to have multiple threads running concurrently
        // Each thread can execute parts of your code in parallel with the main thread
        // Each thread has a priority
        // Threads with higher priority are executed in preference compared to thread with

        // The Java Virtual Machine continues to execute threads until either of the following occurs
        // 1. The exit method of class runtime has been called
        //2. All user threads have died

        // A Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
        // JVM terminates itself when all user threads(non-daemon threads) finish



        //System.out.println(Thread.activeCount());

        //Thread.currentThread().setName("Main");
        //System.out.println(Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getPriority());


       /*  for(int i = 3; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");
        */
        MyThread thread2 = new MyThread(); 

        //thread2.setDaemon(true);
        //System.out.println(thread2.isDaemon());
        //thread2.start();

        System.out.println(thread2.isAlive());

        thread2.getName(); 
        





















        //Multithreading = it is the process of executing multiple threads simultaeneously
        //  Helps maximum utilization of CPU
        // Threads are independent, they won't affect the execution of other threads
        // An exception in one thread will not interrupt other threads
        // useful for serving multiple clients, multiplayer games, or other mutually independent tasks


        /* The two ways of creating threads */
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread3 = new Thread(runnable1);

        thread1.start();
        thread1.join(3000); // the calling thread(e.g main) will have to wait till thread1 is done after 3000 ms
        thread3.start();
        System.out.println(thread3.getPriority());
        System.out.println(thread1.getPriority());

    }
}
